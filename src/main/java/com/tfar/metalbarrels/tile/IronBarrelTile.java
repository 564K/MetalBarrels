package com.tfar.metalbarrels.tile;

import com.tfar.metalbarrels.MetalBarrels;
import com.tfar.metalbarrels.container.MetalBarrelContainer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class IronBarrelTile extends AbstractBarrelTile {
  public IronBarrelTile() {
    super(MetalBarrels.ObjectHolders.IRON_TILE,9,6);
  }

  @Override
  protected ITextComponent getDefaultName() {
    return new TranslationTextComponent("metalbarrels.iron_barrel");
  }

  @Nullable
  @Override
  public Container createMenu(int id, PlayerInventory playerInventory, PlayerEntity player) {
    return MetalBarrelContainer.iron(id, world, pos, playerInventory, player);
  }
}

