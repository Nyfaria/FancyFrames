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
public class StoneFrame extends FrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "stone_frame"), "main");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Constants.MODID, "textures/entity/stone_frame.png");

    public StoneFrame(ModelPart root) {
        super(root);
    }

    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(12, 6).addBox(-1.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offset(-7.0F, 8.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -18.0F, 9.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 24.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 3).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(6, 6).addBox(-3.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(0, 6).addBox(-3.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create(), PartPose.offset(-7.0F, 8.0F, -9.0F));

        PartDefinition cube_r1 = top_left_connector.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -15.5F, 9.5F, 0.0F, 0.0F, -0.7418F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create(), PartPose.offset(-7.0F, 26.0F, -9.0F));

        PartDefinition cube_r2 = bottom_left_connector.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 10).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -18.5F, 9.5F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 26.0F, -9.0F));

        PartDefinition cube_r3 = bottom_right_connector.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 6).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.5F, -18.5F, 9.5F, 0.0F, 0.0F, -0.2618F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition cube_r4 = top_right_connector.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.0F, -15.5F, 9.5F, 0.0F, 0.0F, 0.2618F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}