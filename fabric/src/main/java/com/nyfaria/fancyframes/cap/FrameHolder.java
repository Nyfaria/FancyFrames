package com.nyfaria.fancyframes.cap;

import dev.onyxstudios.cca.api.v3.component.*;
import dev.onyxstudios.cca.api.v3.component.sync.*;
import net.minecraft.nbt.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;

public class FrameHolder implements ComponentV3, Component, CopyableComponent<FrameHolder>, AutoSyncedComponent {
    private ResourceLocation location = null;

    private final Entity entity;

    protected FrameHolder(Entity entity) {
        this.entity = entity;
    }


    @Override
    public void writeToNbt(CompoundTag tag) {
        if (location != null)
            tag.putString("location", location.toString());
    }

    @Override
    public void readFromNbt(CompoundTag nbt) {
        this.location = ResourceLocation.tryParse(nbt.getString("location"));
    }


    public ResourceLocation getLocation() {
        return location;
    }

    public void setLocation(ResourceLocation location) {
        this.location = location;
        updateTracking();
    }


    private void updateTracking() {
        FrameHolderAttacher.FRAME.sync(entity);
    }


    @Override
    public void copyFrom(FrameHolder other) {
        this.location = other.location;
    }
}
