//// Made with Blockbench 4.12.6
//// Exported for Minecraft version 1.17 or later with Mojang mappings
//// Paste this class into your mod and generate all required imports
//
//
//public class StoneFrame<T extends Entity> extends EntityModel<T> {
//	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "stoneframe"), "main");
//	private final ModelPart group;
//	private final ModelPart left_frame;
//	private final ModelPart bottom_frame;
//	private final ModelPart top_frame;
//	private final ModelPart right_frame;
//	private final ModelPart top_left_connector;
//	private final ModelPart bottom_left_connector;
//	private final ModelPart bottom_right_connector;
//	private final ModelPart top_right_connector;
//	private final ModelPart top_left_corner_h;
//	private final ModelPart bottom_right_corner_v;
//	private final ModelPart bottom_right_corner_h;
//	private final ModelPart top_right_corner_v;
//	private final ModelPart top_right_corner_h;
//	private final ModelPart bottom_left_corner_v;
//	private final ModelPart bottom_left_corner_h;
//	private final ModelPart top_left_corner_v;
//
//	public StoneFrame(ModelPart root) {
//		this.group = root.getChild("group");
//		this.left_frame = this.group.getChild("left_frame");
//		this.bottom_frame = this.group.getChild("bottom_frame");
//		this.top_frame = this.group.getChild("top_frame");
//		this.right_frame = this.group.getChild("right_frame");
//		this.top_left_connector = this.group.getChild("top_left_connector");
//		this.bottom_left_connector = this.group.getChild("bottom_left_connector");
//		this.bottom_right_connector = this.group.getChild("bottom_right_connector");
//		this.top_right_connector = this.group.getChild("top_right_connector");
//		this.top_left_corner_h = this.group.getChild("top_left_corner_h");
//		this.bottom_right_corner_v = this.group.getChild("bottom_right_corner_v");
//		this.bottom_right_corner_h = this.group.getChild("bottom_right_corner_h");
//		this.top_right_corner_v = this.group.getChild("top_right_corner_v");
//		this.top_right_corner_h = this.group.getChild("top_right_corner_h");
//		this.bottom_left_corner_v = this.group.getChild("bottom_left_corner_v");
//		this.bottom_left_corner_h = this.group.getChild("bottom_left_corner_h");
//		this.top_left_corner_v = this.group.getChild("top_left_corner_v");
//	}
//
//	public static LayerDefinition createBodyLayer() {
//		MeshDefinition meshdefinition = new MeshDefinition();
//		PartDefinition partdefinition = meshdefinition.getRoot();
//
//		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));
//
//		PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(12, 6).addBox(-1.0F, -13.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 7.0F, -9.5F));
//
//		PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(2, 0).addBox(-15.0F, -18.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 24.0F, -9.5F));
//
//		PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(2, 3).addBox(-15.0F, -16.0F, 9.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));
//
//		PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(0, 6).addBox(-3.0F, -14.0F, 9.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -9.5F));
//
//		PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create(), PartPose.offset(-7.0F, 8.0F, -9.0F));
//
//		PartDefinition cube_r1 = top_left_connector.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(18, 12).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -15.5F, 9.5F, 0.0F, 0.0F, -0.7418F));
//
//		PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create(), PartPose.offset(-7.0F, 26.0F, -9.0F));
//
//		PartDefinition cube_r2 = bottom_left_connector.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(18, 10).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.0F, -18.5F, 9.5F, 0.0F, 0.0F, 0.4363F));
//
//		PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 26.0F, -9.0F));
//
//		PartDefinition cube_r3 = bottom_right_connector.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(18, 6).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.5F, -18.5F, 9.5F, 0.0F, 0.0F, -0.2618F));
//
//		PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create(), PartPose.offset(10.0F, 8.0F, -9.0F));
//
//		PartDefinition cube_r4 = top_right_connector.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 8).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.0F, -15.5F, 9.5F, 0.0F, 0.0F, 0.2618F));
//
//		PartDefinition top_left_corner_h = group.addOrReplaceChild("top_left_corner_h", CubeListBuilder.create().texOffs(24, 22).addBox(-8.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -7.0F));
//
//		PartDefinition bottom_right_corner_v = group.addOrReplaceChild("bottom_right_corner_v", CubeListBuilder.create().texOffs(0, 21).addBox(5.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 8.0F, -7.0F));
//
//		PartDefinition bottom_right_corner_h = group.addOrReplaceChild("bottom_right_corner_h", CubeListBuilder.create().texOffs(6, 21).addBox(0.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 8.0F, -7.0F));
//
//		PartDefinition top_right_corner_v = group.addOrReplaceChild("top_right_corner_v", CubeListBuilder.create().texOffs(12, 21).addBox(3.0F, -16.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, -7.0F));
//
//		PartDefinition top_right_corner_h = group.addOrReplaceChild("top_right_corner_h", CubeListBuilder.create().texOffs(18, 22).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -7.0F, 0.0F));
//
//		PartDefinition bottom_left_corner_v = group.addOrReplaceChild("bottom_left_corner_v", CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 8.0F, -7.0F));
//
//		PartDefinition bottom_left_corner_h = group.addOrReplaceChild("bottom_left_corner_h", CubeListBuilder.create().texOffs(6, 24).addBox(-11.0F, -2.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, -7.0F));
//
//		PartDefinition top_left_corner_v = group.addOrReplaceChild("top_left_corner_v", CubeListBuilder.create().texOffs(12, 24).addBox(-13.0F, -18.0F, 6.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 10.0F, -7.0F));
//
//		return LayerDefinition.create(meshdefinition, 32, 32);
//	}
//
//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
//
//	}
//
//	@Override
//	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
//	}
//}