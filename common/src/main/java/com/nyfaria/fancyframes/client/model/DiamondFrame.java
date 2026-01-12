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
public class DiamondFrame extends FrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "diamond_frame"), "main");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Constants.MODID, "textures/entity/diamond_frame.png");


    public DiamondFrame(ModelPart root) {
        super(root);
    }

    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 6).addBox(-1.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offset(-7.0F, 8.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 3).addBox(-16.0F, -18.0F, 9.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 24.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(6, 6).addBox(-3.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(12, 6).addBox(-3.0F, -15.0F, 9.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(18, 11).addBox(-1.0F, -16.0F, 8.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 8.0F, -9.0F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create().texOffs(18, 16).addBox(-1.0F, -21.0F, 8.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 26.0F, -9.0F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create().texOffs(18, 6).addBox(-5.0F, -21.0F, 8.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 26.0F, -9.0F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0F, -16.0F, 8.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }


    @Override
    public void setupDir(Part part) {
        left_frame.visible = false;
        right_frame.visible = false;
        top_frame.visible = false;
        bottom_frame.visible = false;
        top_left_connector.visible = false;
        top_right_connector.visible = false;
        bottom_left_connector.visible = false;
        bottom_right_connector.visible = false;
        switch (part) {
            case TOP_LEFT -> {
                top_left_connector.visible = true;
                left_frame.visible = true;
                top_frame.visible = true;
            }
            case TOP_RIGHT -> {
                top_right_connector.visible = true;
                right_frame.visible = true;
                top_frame.visible = true;
            }
            case BOTTOM_LEFT -> {
                bottom_left_connector.visible = true;
                left_frame.visible = true;
                bottom_frame.visible = true;
            }
            case BOTTOM_RIGHT -> {
                bottom_right_connector.visible = true;
                right_frame.visible = true;
                bottom_frame.visible = true;
            }
            case LEFT_FRAME -> {
                left_frame.visible = true;
            }
            case RIGHT_FRAME -> {
                right_frame.visible = true;
            }
            case TOP_FRAME -> {
                top_frame.visible = true;
            }
            case BOTTOM_FRAME -> {
                bottom_frame.visible = true;
            }
            case ALL -> {
                left_frame.visible = true;
                right_frame.visible = true;
                top_frame.visible = true;
                bottom_frame.visible = true;
                top_left_connector.visible = true;
                top_right_connector.visible = true;
                bottom_left_connector.visible = true;
                bottom_right_connector.visible = true;
            }
        }
    }

    @Override
    public ModelPart getGroup() {
        return group;
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}