package com.nyfaria.fancyframes.client.model;


import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.model.*;
import net.minecraft.client.model.geom.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.*;


public abstract class ThickFrameModel extends FrameModel {
    private final ModelPart top_left_corner_h;
    private final ModelPart bottom_right_corner_h;
    private final ModelPart top_right_corner_h;
    private final ModelPart bottom_left_corner_h;


    public ThickFrameModel(ModelPart root) {
        super(root);
        this.top_left_corner_h = this.group.getChild("top_left_corner_h");
        this.bottom_right_corner_h = this.group.getChild("bottom_right_corner_h");
        this.top_right_corner_h = this.group.getChild("top_right_corner_h");
        this.bottom_left_corner_h = this.group.getChild("bottom_left_corner_h");
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
        top_left_corner_h.visible = false;
        bottom_right_corner_h.visible = false;
        top_right_corner_h.visible = false;
        bottom_left_corner_h.visible = false;

        switch (part) {
            case TOP_LEFT -> {
                top_frame.visible = true;
                left_frame.visible = true;
                top_left_corner_v.visible = true;
                top_right_corner_h.visible = true;
                bottom_left_corner_v.visible = true;
                top_left_connector.visible = true;
            }
            case TOP_RIGHT -> {
                top_frame.visible = true;
                right_frame.visible = true;
                top_right_corner_v.visible = true;
                top_left_corner_h.visible = true;
                bottom_right_corner_v.visible = true;
                top_right_connector.visible = true;
            }
            case BOTTOM_LEFT -> {
                bottom_frame.visible = true;
                left_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_right_corner_h.visible = true;
                top_left_corner_v.visible = true;
                bottom_left_connector.visible = true;
            }
            case BOTTOM_RIGHT -> {
                bottom_frame.visible = true;
                right_frame.visible = true;
                bottom_right_corner_v.visible = true;
                bottom_left_corner_h.visible = true;
                top_right_corner_v.visible = true;
                bottom_right_connector.visible = true;
            }
            case RIGHT_FRAME -> {
                right_frame.visible = true;
                top_right_corner_v.visible = true;
                bottom_right_corner_v.visible = true;
            }
            case LEFT_FRAME -> {
                left_frame.visible = true;
                top_left_corner_v.visible = true;
                bottom_left_corner_v.visible = true;
            }
            case TOP_FRAME -> {
                top_frame.visible = true;
                top_left_corner_h.visible = true;
                top_right_corner_h.visible = true;
            }
            case BOTTOM_FRAME -> {
                bottom_frame.visible = true;
                bottom_left_corner_h.visible = true;
                bottom_right_corner_h.visible = true;
            }
            case TOP_ALL -> {
                bottom_right_corner_v.visible = true;
                right_frame.visible = true;
                top_right_corner_v.visible = true;
                top_right_connector.visible = true;
                top_frame.visible = true;
                top_left_corner_v.visible = true;
                top_left_connector.visible = true;
                left_frame.visible = true;
                bottom_left_corner_v.visible = true;
            }
            case BOTTOM_ALL -> {
                top_left_corner_v.visible = true;
                left_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_left_connector.visible = true;
                bottom_right_connector.visible = true;
                bottom_frame.visible = true;
                bottom_right_corner_v.visible = true;
                right_frame.visible = true;
                top_right_corner_v.visible = true;
            }
            case LEFT_ALL -> {
                top_left_corner_h.visible = true;
                top_frame.visible = true;
                top_left_corner_v.visible = true;
                top_left_connector.visible = true;
                top_right_corner_h.visible = true;
                left_frame.visible = true;
                bottom_left_corner_v.visible = true;
                bottom_frame.visible = true;
                bottom_right_corner_h.visible = true;
                bottom_left_connector.visible = true;
            }
            case RIGHT_ALL -> {
                top_right_corner_h.visible = true;
                top_frame.visible = true;
                top_right_corner_v.visible = true;
                top_right_connector.visible = true;
                top_left_corner_h.visible = true;
                right_frame.visible = true;
                bottom_right_corner_v.visible = true;
                bottom_frame.visible = true;
                bottom_left_corner_h.visible = true;
                bottom_right_connector.visible = true;

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
                top_left_corner_h.visible = true;
                bottom_right_corner_h.visible = true;
                top_right_corner_h.visible = true;
                bottom_left_corner_h.visible = true;
            }
        }
    }

    public ModelPart getGroup(){
        return group;
    }

    public abstract ResourceLocation getTexture();

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int i, int i1, float v, float v1, float v2, float v3) {
        getGroup().render(poseStack, vertexConsumer, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
    }


}