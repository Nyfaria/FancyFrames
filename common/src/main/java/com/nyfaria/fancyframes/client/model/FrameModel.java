package com.nyfaria.fancyframes.client.model;


import com.mojang.blaze3d.vertex.*;
import com.nyfaria.fancyframes.*;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;


public abstract class FrameModel extends EntityModel<Entity> {


    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    public abstract void setupDir(Part part);

    public abstract ModelPart getGroup();

    public abstract ResourceLocation getTexture();

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int color) {
        getGroup().render(poseStack, buffer, packedLight, packedOverlay, color);
    }

    public enum Part {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT_FRAME,
        RIGHT_FRAME,
        TOP_FRAME,
        BOTTOM_FRAME,
        ALL
    }
}