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
public class WoodenFrameThin extends FrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "wooden_frame_thin"), "main");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Constants.MODID, "textures/entity/wooden_frame_thin.png");

    public WoodenFrameThin(ModelPart root) {
        super(root);
    }

    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(-7.0F, 8.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 2).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 30).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 24.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(4, 4).addBox(-2.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 5).addBox(3.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(8, 6).addBox(-1.0F, -16.0F, 8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 8.0F, -9.0F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create().texOffs(0, 10).addBox(-1.0F, -19.0F, 8.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 26.0F, -9.0F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create().texOffs(8, 8).addBox(-4.0F, -19.0F, 8.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 26.0F, -9.0F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create().texOffs(8, 10).addBox(-3.0F, -16.0F, 8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition top_right_corner_v = group.addOrReplaceChild("top_right_corner_v", CubeListBuilder.create().texOffs(0, 17).addBox(7.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -7.0F));

        PartDefinition bottom_right_corner_v = group.addOrReplaceChild("bottom_right_corner_v", CubeListBuilder.create().texOffs(4, 17).addBox(7.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.0F, -7.0F));

        PartDefinition bottom_left_corner_v = group.addOrReplaceChild("bottom_left_corner_v", CubeListBuilder.create().texOffs(0, 17).addBox(7.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 23.0F, -7.0F));

        PartDefinition top_left_corner_v = group.addOrReplaceChild("top_left_corner_v", CubeListBuilder.create().texOffs(0, 14).addBox(7.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 8.0F, -7.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}