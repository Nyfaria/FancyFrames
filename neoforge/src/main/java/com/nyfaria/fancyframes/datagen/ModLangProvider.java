package com.nyfaria.fancyframes.datagen;

import com.google.common.collect.*;
import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.init.*;
import com.nyfaria.fancyframes.registration.*;
import net.minecraft.data.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.data.*;
import org.apache.commons.lang3.*;

import java.util.*;
import java.util.stream.*;

public class ModLangProvider extends LanguageProvider {
    protected static final String COMMUNITY_PILLAR_STR = "Community Pillar";

    protected static final Map<String, String> REPLACE_LIST = ImmutableMap.of(
            "tnt", "TNT"
    );

    public ModLangProvider(PackOutput gen) {
        super(gen, Constants.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        ItemInit.ITEMS.getEntries().forEach(this::itemLang);
        add("itemGroup.fancyframes", Constants.MOD_NAME);
        add("itemGroup.fancyframes.tab", Constants.MOD_NAME);
    }

    protected void itemLang(RegistryObject<Item> entry) {
        if (!(entry.get() instanceof BlockItem) || entry.get() instanceof ItemNameBlockItem) {
            addItem(entry, checkReplace(entry));
        }
    }

    protected void blockLang(RegistryObject<Block> entry) {
        addBlock(entry, checkReplace(entry));
    }

    protected void entityLang(RegistryObject<EntityType<?>> entry) {
        addEntityType(entry, checkReplace(entry));
    }

    protected String checkReplace(RegistryObject<?> registryObject) {
        return Arrays.stream(registryObject.getId().getPath().split("_"))
                .map(this::checkReplace)
                .filter(s -> !s.isBlank())
                .collect(Collectors.joining(" "))
                .trim();
    }

    protected String checkReplace(String string) {
        return REPLACE_LIST.containsKey(string) ? REPLACE_LIST.get(string) : StringUtils.capitalize(string);
    }
}
