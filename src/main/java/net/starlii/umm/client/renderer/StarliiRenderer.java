
package net.starlii.umm.client.renderer;

import net.starlii.umm.entity.StarliiEntity;
import net.starlii.umm.client.model.Modelstarlii;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class StarliiRenderer extends MobRenderer<StarliiEntity, Modelstarlii<StarliiEntity>> {
	public StarliiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstarlii(context.bakeLayer(Modelstarlii.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StarliiEntity entity) {
		return new ResourceLocation("unnamed_minecraft_mod:textures/entities/starlii.png");
	}
}
