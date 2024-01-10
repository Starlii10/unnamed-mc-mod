// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelstarlii<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "starlii"), "main");
	private final ModelPart base;
	private final ModelPart armright;
	private final ModelPart armleft;

	public Modelstarlii(ModelPart root) {
		this.base = root.getChild("base");
		this.armright = root.getChild("armright");
		this.armleft = root.getChild("armleft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition base = partdefinition.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(13, 0)
						.addBox(4.0F, -17.0F, -6.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-6.0F, -17.0F, -4.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-6.0F, -17.0F, -6.0F, 2.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(-8, -8)
						.addBox(-6.0F, -7.0F, -4.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(4.0F, -17.0F, -4.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(-2, -2)
						.addBox(-6.0F, -17.0F, -4.0F, 2.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -17.0F, -2.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 53)
						.addBox(-4.0F, -16.0F, 3.0F, 9.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -17.0F, -6.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-3.0F, -6.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 24)
						.addBox(-4.0F, -15.0F, -8.0F, 8.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition star = base.addOrReplaceChild("star",
				CubeListBuilder.create().texOffs(0, 58)
						.addBox(-0.5F, -14.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-3.5F, -12.0F, 6.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-2.5F, -11.0F, 6.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(0.5F, -13.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(-1.5F, -13.0F, 6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition armright = partdefinition.addOrReplaceChild("armright", CubeListBuilder.create(),
				PartPose.offset(8.0F, 13.0F, 0.0F));

		PartDefinition cube_r1 = armright.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(43, 40)
						.addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 40)
						.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition elbowright = armright.addOrReplaceChild("elbowright", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = elbowright.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(43, 40)
						.addBox(-1.0F, -1.0F, 11.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 45)
						.addBox(-1.5F, -1.5F, 8.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition clawright = elbowright.addOrReplaceChild("clawright", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.4922F, 11.4922F));

		PartDefinition cube_r3 = clawright.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(53, 1)
						.addBox(0.5F, -1.5F, 16.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 3)
						.addBox(-1.5F, -1.5F, 16.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 1)
						.addBox(-1.5F, -1.5F, 16.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.4922F, -11.4922F, -0.7854F, 0.0F, 0.0F));

		PartDefinition armleft = partdefinition.addOrReplaceChild("armleft", CubeListBuilder.create(),
				PartPose.offset(-8.0F, 13.0F, 0.0F));

		PartDefinition cube_r4 = armleft.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(43, 40)
						.addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 40)
						.addBox(-2.0F, -3.0F, -3.0F, 4.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition elbowleft = armleft.addOrReplaceChild("elbowleft", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = elbowleft.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(43, 40)
						.addBox(-1.0F, -1.0F, 11.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 45)
						.addBox(-1.5F, -1.5F, 8.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition clawleft = elbowleft.addOrReplaceChild("clawleft", CubeListBuilder.create(),
				PartPose.offset(0.0F, 11.4922F, 11.4922F));

		PartDefinition cube_r6 = clawleft.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(53, 3)
						.addBox(-1.5F, -1.5F, 16.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 1)
						.addBox(-1.5F, -1.5F, 16.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 1)
						.addBox(0.5F, -1.5F, 16.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.4922F, -11.4922F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}