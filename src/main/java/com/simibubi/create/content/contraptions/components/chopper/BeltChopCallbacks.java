package com.simibubi.create.content.contraptions.components.chopper;

import com.simibubi.create.content.contraptions.components.chopper.MechanicalChopTileEntity.Mode;
import com.simibubi.create.content.contraptions.relays.belt.transport.TransportedItemStack;
import com.simibubi.create.foundation.item.ItemHelper;
import com.simibubi.create.foundation.tileEntity.behaviour.belt.BeltProcessingBehaviour.ProcessingResult;
import com.simibubi.create.foundation.tileEntity.behaviour.belt.TransportedItemStackHandlerBehaviour;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Optional;

import static com.simibubi.create.foundation.tileEntity.behaviour.belt.BeltProcessingBehaviour.ProcessingResult.HOLD;
import static com.simibubi.create.foundation.tileEntity.behaviour.belt.BeltProcessingBehaviour.ProcessingResult.PASS;

public class BeltChopCallbacks {

	static ProcessingResult onItemReceived(TransportedItemStack transported,
		TransportedItemStackHandlerBehaviour handler, MechanicalChopTileEntity chop) {
		if (chop.getSpeed() == 0 || chop.running)
			return PASS;
		if (!chop.getRecipe(transported.stack)
			.isPresent())
			return PASS;

		chop.start(Mode.BELT);
		return HOLD;
	}

	static ProcessingResult whenItemHeld(TransportedItemStack transported, TransportedItemStackHandlerBehaviour handler,
		MechanicalChopTileEntity chopTe) {

		if (chopTe.getSpeed() == 0)
			return PASS;
		if (!chopTe.running)
			return PASS;
		if (chopTe.runningTicks != MechanicalChopTileEntity.CYCLE / 2)
			return HOLD;

		Optional<ChoppingRecipe> recipe = chopTe.getRecipe(transported.stack);
		chopTe.choppedItems.clear();
		chopTe.choppedItems.add(transported.stack);

		if (!recipe.isPresent())
			return PASS;

		ItemStack out = recipe.get()
			.getRecipeOutput()
			.copy();
		List<ItemStack> multipliedOutput = ItemHelper.multipliedOutput(transported.stack, out);
		if (multipliedOutput.isEmpty())
			transported.stack = ItemStack.EMPTY;
		transported.stack = multipliedOutput.get(0);
		chopTe.sendData();
		return HOLD;
	}

}
