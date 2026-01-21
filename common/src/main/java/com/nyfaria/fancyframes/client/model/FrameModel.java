package com.nyfaria.fancyframes.client.model;


import com.mojang.blaze3d.vertex.*;
import com.nyfaria.fancyframes.*;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;


public abstract class FrameModel extends EntityModel<Entity> {
    protected ModelPart group;
    protected ModelPart left_frame;
    protected ModelPart bottom_frame;
    protected ModelPart top_frame;
    protected ModelPart right_frame;
    protected ModelPart top_left_corner_v;
    protected ModelPart bottom_right_corner_v;
    protected ModelPart top_left_connector;
    protected ModelPart bottom_left_connector;
    protected ModelPart bottom_right_connector;
    protected ModelPart top_right_connector;
    protected ModelPart top_right_corner_v;
    protected ModelPart bottom_left_corner_v;

    public FrameModel(ModelPart root) {
        this.group = root.getChild("group");
        this.left_frame = this.group.getChild("left_frame");
        this.bottom_frame = this.group.getChild("bottom_frame");
        this.top_frame = this.group.getChild("top_frame");
        this.right_frame = this.group.getChild("right_frame");
        this.top_left_corner_v = this.group.getChild("top_left_corner_v");
        this.bottom_right_corner_v = this.group.getChild("bottom_right_corner_v");
        this.top_left_connector = this.group.getChild("top_left_connector");
        this.bottom_left_connector = this.group.getChild("bottom_left_connector");
        this.bottom_right_connector = this.group.getChild("bottom_right_connector");
        this.top_right_connector = this.group.getChild("top_right_connector");
        this.top_right_corner_v = this.group.getChild("top_right_corner_v");
        this.bottom_left_corner_v = this.group.getChild("bottom_left_corner_v");
    }

    @Override
    public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {

    }

    public void setupDir(Part part){
        left_frame.visible = false;
        right_frame.visible = false;
        top_frame.visible = false;
        bottom_frame.visible = false;
        top_left_connector.visible = false;
        top_right_connector.visible = false;
        bottom_left_connector.visible = false;
        bottom_right_connector.visible = false;
        top_left_corner_v.visible = false;
        top_right_corner_v.visible = false;
        bottom_left_corner_v.visible = false;
        bottom_right_corner_v.visible = false;
        switch (part) {
            case TOP_LEFT -> {
                top_left_connector.visible = true;
                left_frame.visible = true;
                top_frame.visible = true;
                bottom_left_corner_v.visible = true;
                top_right_corner_v.visible = true;
            }
            case TOP_RIGHT -> {
                top_right_connector.visible = true;
                right_frame.visible = true;
                top_frame.visible = true;
                bottom_right_corner_v.visible = true;
                top_left_corner_v.visible = true;
            }
            case BOTTOM_LEFT -> {
                bottom_left_connector.visible = true;
                left_frame.visible = true;
                bottom_frame.visible = true;
                top_left_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
            case BOTTOM_RIGHT -> {
                bottom_right_connector.visible = true;
                right_frame.visible = true;
                bottom_frame.visible = true;
                top_right_corner_v.visible = true;
                bottom_left_corner_v.visible = true;
            }
            case LEFT_FRAME -> {
                left_frame.visible = true;
                top_left_corner_v.visible = true;
                bottom_left_corner_v.visible = true;
            }
            case RIGHT_FRAME -> {
                right_frame.visible = true;
                top_right_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
            case TOP_FRAME -> {
                top_frame.visible = true;
                top_left_corner_v.visible = true;
                top_right_corner_v.visible = true;
            }
            case BOTTOM_FRAME -> {
                bottom_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
            case TOP_ALL -> {
                top_frame.visible = true;
                top_left_corner_v.visible = true;
                top_right_corner_v.visible = true;
                top_left_connector.visible = true;
                top_right_connector.visible = true;
                left_frame.visible = true;
                right_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
            case BOTTOM_ALL -> {
                bottom_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
                bottom_left_connector.visible = true;
                bottom_right_connector.visible = true;
                left_frame.visible = true;
                right_frame.visible = true;
                top_left_corner_v.visible = true;
                top_right_corner_v.visible = true;
            }
            case LEFT_ALL -> {
                left_frame.visible = true;
                top_left_corner_v.visible = true;
                bottom_left_corner_v.visible = true;
                top_left_connector.visible = true;
                bottom_left_connector.visible = true;
                top_frame.visible = true;
                bottom_frame.visible = true;
                bottom_right_corner_v.visible = true;
                top_right_corner_v.visible = true;
            }
            case RIGHT_ALL -> {
                right_frame.visible = true;
                top_right_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
                top_right_connector.visible = true;
                bottom_right_connector.visible = true;
                top_frame.visible = true;
                bottom_frame.visible = true;
                bottom_left_corner_v.visible = true;
                top_left_corner_v.visible = true;
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
                top_left_corner_v.visible = true;
                top_right_corner_v.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
        }
    }

    public ModelPart getGroup(){
        return group;
    }

    public abstract ResourceLocation getTexture();

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3) {
        getGroup().render(poseStack, vertexConsumer,LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
    }

    //    @Override
//    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, int i, int i2, int i3, int i4) {
//        getGroup().render(poseStack, buffer, packedLight, packedOverlay, color);
//    }

    public enum Part {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT_FRAME,
        RIGHT_FRAME,
        TOP_FRAME,
        BOTTOM_FRAME,
        BOTTOM_ALL,
        TOP_ALL,
        LEFT_ALL,
        RIGHT_ALL,
        ALL
    }
}