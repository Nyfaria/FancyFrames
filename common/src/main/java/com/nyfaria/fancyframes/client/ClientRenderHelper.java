package com.nyfaria.fancyframes.client;

import com.mojang.blaze3d.vertex.*;
import com.mojang.math.*;
import com.nyfaria.fancyframes.client.model.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.core.*;
import net.minecraft.world.entity.decoration.*;

public class ClientRenderHelper {

    public static <T extends ItemFrame> void renderFrame(T entity, PoseStack poseStack, MultiBufferSource buffer, int packedLight, FrameModel copperFrameModel) {
        Direction facing = entity.getDirection();
        poseStack.pushPose();
//        poseStack.mulPose(Axis.YP.rotationDegrees(-facing.toYRot() + 180.0F));
        poseStack.scale(1, -1, 1);
        poseStack.translate(0.5, -1.5, 0.5);
        copperFrameModel.setupDir(FrameModel.Part.ALL);
        copperFrameModel.renderToBuffer(
                poseStack,
                buffer.getBuffer(RenderType.entityCutoutNoCull(copperFrameModel.getTexture())),
                packedLight,
                OverlayTexture.NO_OVERLAY,
                1,1,1,1
        );
        poseStack.popPose();
    }

    public static <T extends Painting> void renderPaintingFrame(T entity, PoseStack poseStack, MultiBufferSource buffer, int packedLight, FrameModel copperFrameModel) {
        PaintingVariant variant = entity.getVariant().value();

        int widthInBlocks = variant.getWidth() / 16;
        int heightInBlocks = variant.getHeight() / 16;

        VertexConsumer vertexConsumer = buffer.getBuffer(RenderType.entityCutoutNoCull(copperFrameModel.getTexture()));

        for (int x = 0; x < widthInBlocks; x++) {
            for (int y = 0; y < heightInBlocks; y++) {
                boolean isEdge = (x == 0 || x == widthInBlocks - 1 || y == 0 || y == heightInBlocks - 1);

                if (isEdge) {
                    poseStack.pushPose();
                    poseStack.scale(1, -1, 1);
                    poseStack.scale(16, 16, 16);
                    poseStack.scale(1.001f, 1.001f, 1.001f);
                    float offsetX = (x - (widthInBlocks - 1) / 2.0f);
                    float offsetY = (y - (heightInBlocks - 1) / 2.0f);
                    poseStack.translate(offsetX, offsetY - (16f / 16f), -7.5 / 16f);
                    copperFrameModel.setupDir(calculatePart(x, y, widthInBlocks, heightInBlocks));
                    copperFrameModel.renderToBuffer(
                            poseStack,
                            vertexConsumer,
                            packedLight,
                            OverlayTexture.NO_OVERLAY,
                            1,1,1,1
                    );

                    poseStack.popPose();
                }
            }
        }
    }

    public static FrameModel.Part calculatePart(int x, int y, int width, int height) {
        boolean isLeft = (x == 0);
        boolean isRight = (x == width - 1);
        boolean isTop = (y == 0);
        boolean isBottom = (y == height - 1);

        if (isLeft && isTop && isRight && isBottom) {
            return FrameModel.Part.ALL;
        }

        if (isLeft && isRight) {
            if (isTop) {
                return FrameModel.Part.TOP_ALL;
            } else if (isBottom) {
                return FrameModel.Part.BOTTOM_ALL;
            }
        }

        if (isTop && isBottom) {
            if (isLeft) {
                return FrameModel.Part.LEFT_ALL;
            } else if (isRight) {
                return FrameModel.Part.RIGHT_ALL;
            }
        }

        if (isLeft && isTop) {
            return FrameModel.Part.TOP_LEFT;
        } else if (isRight && isTop) {
            return FrameModel.Part.TOP_RIGHT;
        } else if (isLeft && isBottom) {
            return FrameModel.Part.BOTTOM_LEFT;
        } else if (isRight && isBottom) {
            return FrameModel.Part.BOTTOM_RIGHT;
        } else if (isTop) {
            return FrameModel.Part.TOP_FRAME;
        } else if (isBottom) {
            return FrameModel.Part.BOTTOM_FRAME;
        } else if (isLeft) {
            return FrameModel.Part.LEFT_FRAME;
        } else if (isRight) {
            return FrameModel.Part.RIGHT_FRAME;
        } else {
            return FrameModel.Part.ALL;
        }
    }
}
