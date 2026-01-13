package com.nyfaria.fancyframes.client.model;


import com.nyfaria.fancyframes.*;
import com.nyfaria.fancyframes.annotations.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.*;

@Frame
public class NetheriteFrame extends ThickFrameModel {
    @Frame.Location
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(Constants.MODID, "netherite_frame"), "main");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Constants.MODID, "textures/entity/netherite_frame.png");

    public NetheriteFrame(ModelPart root) {
        super(root);
    }


    @Frame.Layer
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

        PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 6).mirror().addBox(-1.0F, -14.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-7.0F, 8.0F, -9.5F));

        PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-15.0F, -18.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 24.0F, -9.5F));

        PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 3).addBox(-15.0F, -16.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(0, 6).addBox(-3.0F, -14.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));

        PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(12, 16).addBox(-18.0F, -16.0F, 8.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create().texOffs(12, 11).addBox(-6.0F, -16.0F, 8.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create().texOffs(12, 6).addBox(-6.0F, -4.0F, 8.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create().texOffs(12, 6).mirror().addBox(-18.0F, -4.0F, 8.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offset(10.0F, 8.0F, -9.0F));

        PartDefinition bottom_right_corner_v = group.addOrReplaceChild("bottom_right_corner_v", CubeListBuilder.create().texOffs(0, 21).addBox(5.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 8.0F, -7.0F));

        PartDefinition bottom_right_corner_h = group.addOrReplaceChild("bottom_right_corner_h", CubeListBuilder.create().texOffs(6, 21).addBox(0.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 8.0F, -7.0F));

        PartDefinition top_right_corner_v = group.addOrReplaceChild("top_right_corner_v", CubeListBuilder.create().texOffs(12, 21).addBox(3.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, -7.0F));

        PartDefinition top_right_corner_h = group.addOrReplaceChild("top_right_corner_h", CubeListBuilder.create().texOffs(18, 22).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -7.0F, 0.0F));

        PartDefinition bottom_left_corner_v = group.addOrReplaceChild("bottom_left_corner_v", CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 8.0F, -7.0F));

        PartDefinition bottom_left_corner_h = group.addOrReplaceChild("bottom_left_corner_h", CubeListBuilder.create().texOffs(6, 24).addBox(-11.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, -7.0F));

        PartDefinition top_left_corner_v = group.addOrReplaceChild("top_left_corner_v", CubeListBuilder.create().texOffs(12, 24).addBox(-13.0F, -18.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 10.0F, -7.0F));

        PartDefinition top_left_corner_h = group.addOrReplaceChild("top_left_corner_h", CubeListBuilder.create().texOffs(24, 22).addBox(-8.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -7.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public ResourceLocation getTexture() {
        return TEXTURE;
    }
}