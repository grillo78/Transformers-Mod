package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;

import com.marctron.transformersmod.util.handlers.RegistryHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemEnergonChunkRed extends ItemFood {
    int HealthFix;
    int Cooldown;

    private PotionEffect[] effects;

    public ItemEnergonChunkRed(String name, int amount, boolean isWolfFood, int StackSize, int health, int cooldown) {
        super(amount, isWolfFood);
       
        setRegistryName(name);
        setCreativeTab(Main.tabTransformers);

        Cooldown = cooldown;
        HealthFix = health;

        setMaxStackSize(1);


      
    }

    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.DRINK;

    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);

        if (playerIn.getHealth() != playerIn.getMaxHealth()) {
            playerIn.getCooldownTracker().setCooldown(this, Cooldown);
            if (!worldIn.isRemote) {
                playerIn.setHealth(playerIn.getHealth() + HealthFix);

            }

            playerIn.inventory.clearMatchingItems(RegistryHandler.ModItems.RED_ENERGON_MUG, 0, 1, null);

        }

        return new ActionResult(EnumActionResult.SUCCESS, itemstack);
    }


}
