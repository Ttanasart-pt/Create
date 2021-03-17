package com.simibubi.create;

import javax.annotation.Nullable;

import com.simibubi.create.content.contraptions.fluids.VirtualFluid;
import com.simibubi.create.content.contraptions.fluids.potion.PotionFluid;
import com.simibubi.create.content.contraptions.fluids.potion.PotionFluid.PotionFluidAttributes;
import com.simibubi.create.content.palettes.AllPaletteBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class AllFluids {

	private static final CreateRegistrate REGISTRATE = Create.registrate();

	public static RegistryEntry<PotionFluid> POTION =
		REGISTRATE.virtualFluid("potion", PotionFluidAttributes::new, PotionFluid::new)
			.lang(f -> "fluid.create.potion", "Potion")
			.register();

	public static RegistryEntry<VirtualFluid> MILK = REGISTRATE.virtualFluid("milk")
		.lang(f -> "fluid.create.milk", "Milk")
		.tag(AllTags.forgeFluidTag("milk"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_CHOCOLATE = REGISTRATE.virtualFluid("milk_chocolate")
		.lang(f -> "fluid.create.milk_chocolate", "Chocolate Milk")
		.tag(AllTags.forgeFluidTag("milk"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_BERRY = REGISTRATE.virtualFluid("milk_berry")
		.lang(f -> "fluid.create.milk_berry", "Berry Milk")
		.tag(AllTags.forgeFluidTag("milk"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA = REGISTRATE.virtualFluid("tea")
		.lang(f -> "fluid.create.tea", "Builder's Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA_LAVENDER = REGISTRATE.virtualFluid("tea_lavender")
		.lang(f -> "fluid.create.tea_lavender", "Lavender Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA_GREEN = REGISTRATE.virtualFluid("tea_green")
		.lang(f -> "fluid.create.tea_green", "Green Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA_CHORUS = REGISTRATE.virtualFluid("tea_chorus")
		.lang(f -> "fluid.create.tea_chorus", "Chorus Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA_DANDELION = REGISTRATE.virtualFluid("tea_dandelion")
		.lang(f -> "fluid.create.tea_dandelion", "Dandelion Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> TEA_BLACK = REGISTRATE.virtualFluid("tea_black")
		.lang(f -> "fluid.create.tea_black", "Black Tea")
		.tag(AllTags.forgeFluidTag("tea"))
		.register();

	public static RegistryEntry<VirtualFluid> SAP = REGISTRATE.virtualFluid("sap")
		.lang(f -> "fluid.create.sap", "Tree Sap")
		.tag(AllTags.forgeFluidTag("sap"))
		.register();

	public static RegistryEntry<VirtualFluid> SYRUP = REGISTRATE.virtualFluid("syrup")
		.lang(f -> "fluid.create.syrup", "Syrup")
		.tag(AllTags.forgeFluidTag("syrup"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_GOOSEBERRY = REGISTRATE.virtualFluid("juice_gooseberry")
		.lang(f -> "fluid.create.juice_gooseberry", "Gooseberry Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_APPLE = REGISTRATE.virtualFluid("juice_apple")
		.lang(f -> "fluid.create.juice_apple", "Apple Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_CHORUS = REGISTRATE.virtualFluid("juice_chorus")
		.lang(f -> "fluid.create.juice_chorus", "Chorus Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_SEA_PICKLE = REGISTRATE.virtualFluid("juice_sea_pickle")
		.lang(f -> "fluid.create.juice_sea_pickle", "Sea Pickle Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_CACTUS = REGISTRATE.virtualFluid("juice_cactus")
		.lang(f -> "fluid.create.juice_cactus", "Cactus Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_BERRY = REGISTRATE.virtualFluid("juice_berry")
		.lang(f -> "fluid.create.juice_berry", "Berry Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_P8 = REGISTRATE.virtualFluid("juice_p8")
		.lang(f -> "fluid.create.juice_p8", "P8 Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JUICE_MELON = REGISTRATE.virtualFluid("juice_melon")
		.lang(f -> "fluid.create.juice_melon", "Melon Juice")
		.tag(AllTags.forgeFluidTag("juice"))
		.register();

	public static RegistryEntry<VirtualFluid> JAM_GOOSEBERRY = REGISTRATE.virtualFluid("jam_gooseberry")
		.lang(f -> "fluid.create.jam_gooseberry", "Gooseberry Jam")
		.tag(AllTags.forgeFluidTag("jam"))
		.register();

	public static RegistryEntry<VirtualFluid> JAM_MULBERRY = REGISTRATE.virtualFluid("jam_mulberry")
		.lang(f -> "fluid.create.jam_mulberry", "Mulberry Jam")
		.tag(AllTags.forgeFluidTag("jam"))
		.register();

	public static RegistryEntry<VirtualFluid> JAM_BERRY = REGISTRATE.virtualFluid("jam_berry")
		.lang(f -> "fluid.create.jam_berry", "Berry Jam")
		.tag(AllTags.forgeFluidTag("jam"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE = REGISTRATE.virtualFluid("coffee")
		.lang(f -> "fluid.create.coffee", "Coffee")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE_ESPRESSO = REGISTRATE.virtualFluid("coffee_espresso")
		.lang(f -> "fluid.create.coffee_espresso", "Espresso")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE_LATTE = REGISTRATE.virtualFluid("coffee_latte")
		.lang(f -> "fluid.create.coffee_latte", "Latte")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE_MACCHIATO = REGISTRATE.virtualFluid("coffee_macchiato")
		.lang(f -> "fluid.create.coffee_macchiato", "Macchiato")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE_MOCHA = REGISTRATE.virtualFluid("coffee_mocha")
		.lang(f -> "fluid.create.coffee_mocha", "Mocha")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COFFEE_FRAPPE = REGISTRATE.virtualFluid("coffee_frappe")
		.lang(f -> "fluid.create.coffee_frappe", "Frappe")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> COCOA = REGISTRATE.virtualFluid("cocoa")
		.lang(f -> "fluid.create.cocoa", "Cocoa")
		.tag(AllTags.forgeFluidTag("coffee"))
		.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_VANILLA = REGISTRATE.virtualFluid("ice_cream_vanilla")
		.lang(f -> "fluid.create.ice_cream_vanilla", "Vanilla Ice Cream")
		.tag(AllTags.forgeFluidTag("ice_cream"))
		.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_CHOCOLATE = REGISTRATE.virtualFluid("ice_cream_chocolate")
			.lang(f -> "fluid.create.ice_cream_chocolate", "Chocolate Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_STRAWBERRY = REGISTRATE.virtualFluid("ice_cream_strawberry")
			.lang(f -> "fluid.create.ice_cream_strawberry", "Strawberry Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_NEAPOLITAN = REGISTRATE.virtualFluid("ice_cream_neapolitan")
			.lang(f -> "fluid.create.ice_cream_neapolitan", "Neapolitan Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_BANANA = REGISTRATE.virtualFluid("ice_cream_banana")
			.lang(f -> "fluid.create.ice_cream_banana", "Banana Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_ADZUKI = REGISTRATE.virtualFluid("ice_cream_adzuki")
			.lang(f -> "fluid.create.ice_cream_adzuki", "Adzuki Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> ICE_CREAM_MINT = REGISTRATE.virtualFluid("ice_cream_mint")
			.lang(f -> "fluid.create.ice_cream_mint", "Mint Ice Cream")
			.tag(AllTags.forgeFluidTag("ice_cream"))
			.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_VANILLA = REGISTRATE.virtualFluid("milk_shake_vanilla")
		.lang(f -> "fluid.create.milk_shake_vanilla", "Vanilla Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_CHOCOLATE = REGISTRATE.virtualFluid("milk_shake_chocolate")
		.lang(f -> "fluid.create.milk_shake_chocolate", "Chocolate Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_STRAWBERRY = REGISTRATE.virtualFluid("milk_shake_strawberry")
		.lang(f -> "fluid.create.milk_shake_strawberry", "Strawberry Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_MINT = REGISTRATE.virtualFluid("milk_shake_mint")
		.lang(f -> "fluid.create.milk_shake_mint", "Mint Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_ADZUKI = REGISTRATE.virtualFluid("milk_shake_adzuki")
		.lang(f -> "fluid.create.milk_shake_adzuki", "Adzuki Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_BANANA = REGISTRATE.virtualFluid("milk_shake_banana")
		.lang(f -> "fluid.create.milk_shake_banana", "Banana Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> MILK_SHAKE_NEAPOLITAN = REGISTRATE.virtualFluid("milk_shake_neapolitan")
		.lang(f -> "fluid.create.milk_shake_neapolitan", "Neapolitan Milk Shake")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> SMOOTHIE_APPLE = REGISTRATE.virtualFluid("smoothie_apple")
		.lang(f -> "fluid.create.smoothie_apple", "Apple Smoothie")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> SMOOTHIE_BERRY = REGISTRATE.virtualFluid("smoothie_berry")
		.lang(f -> "fluid.create.smoothie_berry", "Berry Smoothie")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> SMOOTHIE_MELON = REGISTRATE.virtualFluid("smoothie_melon")
		.lang(f -> "fluid.create.smoothie_melon", "Melon Smoothie")
		.tag(AllTags.forgeFluidTag("shake"))
		.register();

	public static RegistryEntry<VirtualFluid> JELLY_MELON = REGISTRATE.virtualFluid("jelly_melon")
		.lang(f -> "fluid.create.jelly_melon", "Melon Jelly")
		.tag(AllTags.forgeFluidTag("jelly"))
		.register();

	public static RegistryEntry<VirtualFluid> JELLY_BERRY = REGISTRATE.virtualFluid("jelly_berry")
		.lang(f -> "fluid.create.jelly_berry", "Berry Jelly")
		.tag(AllTags.forgeFluidTag("jelly"))
		.register();

	public static RegistryEntry<VirtualFluid> JELLY_APPLE = REGISTRATE.virtualFluid("jelly_apple")
		.lang(f -> "fluid.create.jelly_apple", "Apple Jelly")
		.tag(AllTags.forgeFluidTag("jelly"))
		.register();

	public static RegistryEntry<VirtualFluid> JELLY_MAGMA = REGISTRATE.virtualFluid("jelly_magma")
		.lang(f -> "fluid.create.jelly_magma", "Magma Jelly")
		.tag(AllTags.forgeFluidTag("jelly"))
		.register();

	public static RegistryEntry<VirtualFluid> JELLY_SLIME = REGISTRATE.virtualFluid("jelly_slime")
		.lang(f -> "fluid.create.jelly_slime", "Slime Jelly")
		.tag(AllTags.forgeFluidTag("jelly"))
		.register();

	public static RegistryEntry<VirtualFluid> STOCK = REGISTRATE.virtualFluid("stock")
		.lang(f -> "fluid.create.stock", "Stock")
		.tag(AllTags.forgeFluidTag("stock"))
		.register();

	public static RegistryEntry<VirtualFluid> SOUP_BEETROOT = REGISTRATE.virtualFluid("soup_beetroot")
		.lang(f -> "fluid.create.soup_beetroot", "Beetroot Soup")
		.tag(AllTags.forgeFluidTag("soup"))
		.register();

	public static RegistryEntry<VirtualFluid> SOUP_PUMPKIN = REGISTRATE.virtualFluid("soup_pumpkin")
		.lang(f -> "fluid.create.soup_pumpkin", "Pumpkin Soup")
		.tag(AllTags.forgeFluidTag("soup"))
		.register();

	public static RegistryEntry<VirtualFluid> SOUP_POTATO = REGISTRATE.virtualFluid("soup_potato")
		.lang(f -> "fluid.create.soup_potato", "Potato Soup")
		.tag(AllTags.forgeFluidTag("soup"))
		.register();

	public static RegistryEntry<VirtualFluid> SOUP_CARROT = REGISTRATE.virtualFluid("soup_carrot")
		.lang(f -> "fluid.create.soup_carrot", "Carrot Soup")
		.tag(AllTags.forgeFluidTag("soup"))
		.register();

	public static RegistryEntry<VirtualFluid> SOUP_NODDLE = REGISTRATE.virtualFluid("soup_noddle")
		.lang(f -> "fluid.create.soup_noddle", "Noddle Soup")
		.tag(AllTags.forgeFluidTag("soup"))
		.register();

	public static RegistryEntry<VirtualFluid> CREAM = REGISTRATE.virtualFluid("cream")
		.lang(f -> "fluid.create.cream", "Cream")
		.tag(AllTags.forgeFluidTag("milk"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT = REGISTRATE.virtualFluid("yogurt")
		.lang(f -> "fluid.create.yogurt", "Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT_CHOCOLATE = REGISTRATE.virtualFluid("yogurt_chocolate")
		.lang(f -> "fluid.create.yogurt_chocolate", "Chocolate Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT_CARAMEL = REGISTRATE.virtualFluid("yogurt_caramel")
		.lang(f -> "fluid.create.yogurt_caramel", "Caramel Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT_PUMPKIN = REGISTRATE.virtualFluid("yogurt_pumpkin")
		.lang(f -> "fluid.create.yogurt_pumpkin", "Pumpkin Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT_BERRY = REGISTRATE.virtualFluid("yogurt_berry")
		.lang(f -> "fluid.create.yogurt_berry", "Berry Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> YOGURT_APPLE = REGISTRATE.virtualFluid("yogurt_apple")
		.lang(f -> "fluid.create.yogurt_apple", "Apple Yogurt")
		.tag(AllTags.forgeFluidTag("yogurt"))
		.register();

	public static RegistryEntry<VirtualFluid> MAYONAISE = REGISTRATE.virtualFluid("mayonaise")
		.lang(f -> "fluid.create.mayonaise", "Mayonaise")
		.tag(AllTags.forgeFluidTag("mayonaise"))
		.register();

	public static RegistryEntry<VirtualFluid> OIL_COOKING = REGISTRATE.virtualFluid("oil_cooking")
		.lang(f -> "fluid.create.oil_cooking", "Cooking Oil")
		.tag(AllTags.forgeFluidTag("oil"))
		.register();

	public static RegistryEntry<VirtualFluid> VINEGAR = REGISTRATE.virtualFluid("vinegar")
		.lang(f -> "fluid.create.vinegar", "Vinegar")
		.tag(AllTags.forgeFluidTag("vinegar"))
		.register();

	public static RegistryEntry<ForgeFlowingFluid.Flowing> HONEY =
		REGISTRATE.standardFluid("honey", NoColorFluidAttributes::new)
			.lang(f -> "fluid.create.honey", "Honey")
			.attributes(b -> b.viscosity(500)
				.density(1400))
			.properties(p -> p.levelDecreasePerBlock(2)
				.tickRate(25)
				.slopeFindDistance(3)
				.explosionResistance(100f))
			.tag(AllTags.forgeFluidTag("honey"))
			.bucket()
			.properties(p -> p.maxStackSize(1))
			.build()
			.register();

	public static RegistryEntry<ForgeFlowingFluid.Flowing> CHOCOLATE =
		REGISTRATE.standardFluid("chocolate", NoColorFluidAttributes::new)
			.lang(f -> "fluid.create.chocolate", "Chocolate")
			.tag(AllTags.forgeFluidTag("chocolate"))
			.attributes(b -> b.viscosity(500)
				.density(1400))
			.properties(p -> p.levelDecreasePerBlock(2)
				.tickRate(25)
				.slopeFindDistance(3)
				.explosionResistance(100f))
			.bucket()
			.properties(p -> p.maxStackSize(1))
			.build()
			.register();

	// Load this class

	public static void register() {}

	@OnlyIn(Dist.CLIENT)
	public static void assignRenderLayers() {}

	@OnlyIn(Dist.CLIENT)
	private static void makeTranslucent(RegistryEntry<? extends ForgeFlowingFluid> entry) {
		ForgeFlowingFluid fluid = entry.get();
		RenderTypeLookup.setRenderLayer(fluid, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(fluid.getStillFluid(), RenderType.getTranslucent());
	}

	@Nullable
	public static BlockState getLavaInteraction(FluidState fluidState) {
		Fluid fluid = fluidState.getFluid();
		if (fluid.isEquivalentTo(HONEY.get()))
			return fluidState.isSource() ? AllPaletteBlocks.LIMESTONE.getDefaultState()
				: AllPaletteBlocks.LIMESTONE_VARIANTS.registeredBlocks.get(0)
					.getDefaultState();
		if (fluid.isEquivalentTo(CHOCOLATE.get()))
			return fluidState.isSource() ? AllPaletteBlocks.SCORIA.getDefaultState()
				: AllPaletteBlocks.SCORIA_VARIANTS.registeredBlocks.get(0)
					.getDefaultState();
		return null;
	}

	/**
	 * Removing alpha from tint prevents optifine from forcibly applying biome
	 * colors to modded fluids (Makes translucent fluids disappear)
	 */
	private static class NoColorFluidAttributes extends FluidAttributes {

		protected NoColorFluidAttributes(Builder builder, Fluid fluid) {
			super(builder, fluid);
		}

		@Override
		public int getColor(IBlockDisplayReader world, BlockPos pos) {
			return 0x00ffffff;
		}

	}

}
