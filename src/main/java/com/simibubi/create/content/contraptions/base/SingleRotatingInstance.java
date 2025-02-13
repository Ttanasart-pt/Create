package com.simibubi.create.content.contraptions.base;

import static com.simibubi.create.content.contraptions.base.KineticTileEntityRenderer.KINETIC_TILE;

import com.simibubi.create.foundation.render.backend.instancing.InstanceKey;
import com.simibubi.create.foundation.render.backend.instancing.InstancedModel;
import com.simibubi.create.foundation.render.backend.instancing.InstancedTileRenderer;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class SingleRotatingInstance extends KineticTileInstance<KineticTileEntity> {

    protected InstanceKey<RotatingData> rotatingModelKey;

    public SingleRotatingInstance(InstancedTileRenderer<?> modelManager, KineticTileEntity tile) {
        super(modelManager, tile);
    }

    @Override
    protected void init() {
        Direction.Axis axis = ((IRotate) lastState.getBlock()).getRotationAxis(lastState);
        rotatingModelKey = setup(getModel().createInstance(), tile.getSpeed(), axis);
    }

    @Override
    public void onUpdate() {
        Direction.Axis axis = ((IRotate) lastState.getBlock()).getRotationAxis(lastState);
        updateRotation(rotatingModelKey, axis);
    }

    @Override
    public void updateLight() {
        relight(pos, rotatingModelKey.getInstance());
    }

    @Override
    public void remove() {
        rotatingModelKey.delete();
    }

    protected BlockState getRenderedBlockState() {
        return lastState;
    }

    protected InstancedModel<RotatingData> getModel() {
        return rotatingMaterial().getModel(KINETIC_TILE, getRenderedBlockState());
    }
}
