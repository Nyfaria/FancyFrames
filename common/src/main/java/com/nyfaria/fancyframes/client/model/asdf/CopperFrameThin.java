// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class CopperFrameThin<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "copperframethin"), "main");
	private final ModelPart group;
	private final ModelPart left_frame;
	private final ModelPart bottom_frame;
	private final ModelPart top_frame;
	private final ModelPart right_frame;
	private final ModelPart top_left_connector;
	private final ModelPart bottom_left_connector;
	private final ModelPart bottom_right_connector;
	private final ModelPart top_right_connector;
	private final ModelPart top_left_corner;
	private final ModelPart bottom_left_corner;
	private final ModelPart bottom_right_corner;
	private final ModelPart top_right_corner;

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
		this.top_left_corner = this.group.getChild("top_left_corner");
		this.bottom_left_corner = this.group.getChild("bottom_left_corner");
		this.bottom_right_corner = this.group.getChild("bottom_right_corner");
		this.top_right_corner = this.group.getChild("top_right_corner");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition group = partdefinition.addOrReplaceChild("group", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 7.0F));

		PartDefinition left_frame = group.addOrReplaceChild("left_frame", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(21, 4).addBox(-1.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(-7.0F, 8.0F, -9.5F));

		PartDefinition bottom_frame = group.addOrReplaceChild("bottom_frame", CubeListBuilder.create().texOffs(0, 2).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-16.0F, -17.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 24.0F, -9.5F));

		PartDefinition top_frame = group.addOrReplaceChild("top_frame", CubeListBuilder.create().texOffs(0, 0).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 21).addBox(-16.0F, -16.0F, 9.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

		PartDefinition right_frame = group.addOrReplaceChild("right_frame", CubeListBuilder.create().texOffs(4, 4).addBox(-2.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(28, 5).addBox(-2.0F, -15.0F, 9.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offset(9.0F, 8.0F, -9.5F));

		PartDefinition top_left_connector = group.addOrReplaceChild("top_left_connector", CubeListBuilder.create().texOffs(12, 7).addBox(14.0F, -16.0F, 8.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 8.0F, -9.0F));

		PartDefinition bottom_left_connector = group.addOrReplaceChild("bottom_left_connector", CubeListBuilder.create().texOffs(8, 10).addBox(-1.0F, -19.0F, 8.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-7.0F, 26.0F, -9.0F));

		PartDefinition bottom_right_connector = group.addOrReplaceChild("bottom_right_connector", CubeListBuilder.create().texOffs(8, 4).addBox(-3.0F, -23.0F, 8.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 26.0F, -9.0F));

		PartDefinition top_right_connector = group.addOrReplaceChild("top_right_connector", CubeListBuilder.create().texOffs(12, 4).addBox(-18.0F, -16.0F, 8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(10.0F, 8.0F, -9.0F));

		PartDefinition top_left_corner = group.addOrReplaceChild("top_left_corner", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 8.0F, -7.0F));

		PartDefinition bottom_left_corner = group.addOrReplaceChild("bottom_left_corner", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 23.0F, -7.0F));

		PartDefinition bottom_right_corner = group.addOrReplaceChild("bottom_right_corner", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 23.0F, -7.0F));

		PartDefinition top_right_corner = group.addOrReplaceChild("top_right_corner", CubeListBuilder.create().texOffs(0, 17).addBox(-2.0F, -16.0F, 6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, 8.0F, -7.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}