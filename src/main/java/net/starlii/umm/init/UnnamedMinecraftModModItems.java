
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.starlii.umm.init;

import net.starlii.umm.item.PowerStarItem;
import net.starlii.umm.UnnamedMinecraftModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class UnnamedMinecraftModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnnamedMinecraftModMod.MODID);
	public static final RegistryObject<Item> STARLII_SPAWN_EGG = REGISTRY.register("starlii_spawn_egg", () -> new ForgeSpawnEggItem(UnnamedMinecraftModModEntities.STARLII, -3355648, -6711040, new Item.Properties()));
	public static final RegistryObject<Item> POWER_STAR = REGISTRY.register("power_star", () -> new PowerStarItem());
}
