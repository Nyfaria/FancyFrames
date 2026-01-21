package com.nyfaria.fancyframes.client.model;


import com.mojang.blaze3d.vertex.*;
import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.annotations.*;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;

@Frame
public class WoodenFrame extends ThickFrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Constants.MODID, "wooden_frame"), "main");
    public static final ResourceLocation TEXTURE = new ResourceLocation(Constants.MODID, "textures/entity/wooden_frame.png");

    public WoodenFrame(ModelPart root) {
        super(root);
    }


    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 8).addBox(-1.0F, -13.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 8).addBox(-1.0F, -13.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(-7.0F, -1.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(2, 3).addBox(-15.0F, -18.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 16.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(2, 0).addBox(-15.0F, -16.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-15.0F, -14.0F, 9.0F, 11.8F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 0.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(12, 8).addBox(-3.0F, -13.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(-0.01F))
                .texOffs(18, 8).addBox(-3.0F, -13.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, -1.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(12, 23).addBox(-1.0F, -16.0F, 8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 0.0F, -9.0F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create().texOffs(24, 9).addBox(-1.0F, -19.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 18.0F, -9.0F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create().texOffs(0, 23).addBox(-6.0F, -19.0F, 8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 18.0F, -9.0F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create().texOffs(24, 6).addBox(-6.0F, -16.0F, 8.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 0.0F, -9.0F));

        PartDefinition bottom_right_corner_v = group.addOrReplaceChild("bottom_right_corner_v", CubeListBuilder.create().texOffs(0, 26).addBox(5.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, -7.0F));

        PartDefinition bottom_right_corner_h = group.addOrReplaceChild("bottom_right_corner_h", CubeListBuilder.create().texOffs(6, 26).addBox(0.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, -7.0F));

        PartDefinition top_right_corner_v = group.addOrReplaceChild("top_right_corner_v", CubeListBuilder.create().texOffs(12, 26).addBox(3.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, -7.0F));

        PartDefinition top_right_corner_h = group.addOrReplaceChild("top_right_corner_h", CubeListBuilder.create().texOffs(18, 27).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -15.0F, 0.0F));

        PartDefinition bottom_left_corner_v = group.addOrReplaceChild("bottom_left_corner_v", CubeListBuilder.create().texOffs(0, 29).addBox(-6.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 0.0F, -7.0F));

        PartDefinition bottom_left_corner_h = group.addOrReplaceChild("bottom_left_corner_h", CubeListBuilder.create().texOffs(6, 29).addBox(-11.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 0.0F, -7.0F));

        PartDefinition top_left_corner_v = group.addOrReplaceChild("top_left_corner_v", CubeListBuilder.create().texOffs(12, 29).addBox(-13.0F, -18.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, -7.0F));

        PartDefinition top_left_corner_h = group.addOrReplaceChild("top_left_corner_h", CubeListBuilder.create().texOffs(24, 27).addBox(-8.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -7.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}