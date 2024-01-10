
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starlii.umm.init;

import net.starlii.umm.client.model.Modelstarlii;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class UnnamedMinecraftModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelstarlii.LAYER_LOCATION, Modelstarlii::createBodyLayer);
	}
}
