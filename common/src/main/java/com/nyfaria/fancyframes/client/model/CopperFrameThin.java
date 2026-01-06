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
public class CopperFrameThin extends FrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "copper_frame_thin"), "main");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Constants.MODID, "textures/entity/copper_frame_thin.png");

    private final ModelPart group;
    private final ModelPart left_frame;
    private final ModelPart bottom_frame;
    private final ModelPart top_frame;
    private final ModelPart right_frame;
    private final ModelPart top_left_connector;
    private final ModelPart bottom_left_connector;
    private final ModelPart bottom_right_connector;
    private final ModelPart top_right_connector;

    public CopperFrameThin(ModelPart root) {
        this.group = root.getChild("group");
        this.left_frame = this.group.getChild("left_frame");
        this.bottom_frame = this.group.getChild("bottom_frame");
        this.top_frame = this.group.getChild("top_frame");
        this.right_frame = this.group.getChild("right_frame");
        this.top_left_connector = this.group.getChild("top_left_connector");
        this.bottom_left_connector = this.group.getChild("bottom_left_connector");
        this.bottom_right_connector = this.group.getChild("bottom_right_connector");
        this.top_right_connector = this.group.getChild("top_right_connector");
    }

    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(21, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(-7.0F, 8.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 2).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 30).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 24.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(4, 4).addBox(-2.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 5).addBox(-2.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(12, 4).addBox(-1.0F, -16.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(12, 7).addBox(14.0F, -16.0F, 8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(8, 4).addBox(14.0F, -5.0F, 8.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(8, 10).addBox(-1.0F, -1.0F, 8.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 8.0F, -9.0F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create(), PartPose.offset(-7.0F, 26.0F, -9.0F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 26.0F, -9.0F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 8.0F, -9.0F));

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