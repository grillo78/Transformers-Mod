package com.marctron.transformersmod.transformers.transformer.vehicon;


import com.marctron.transformersmod.transformers.models.vehicon.ModelVehiconMid;
import com.marctron.transformersmod.transformers.transformer.ArmorTypes;
import com.marctron.transformersmod.transformers.transformer.ItemArmorTransformer;
import com.marctron.transformersmod.util.handlers.RegistryHandler;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Timer;
import java.util.TimerTask;

public final class VehiconMid2 extends ItemArmorTransformer {

  

    public VehiconMid2(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        
        setRegistryName(name);
        setCreativeTab(null);
        setMaxStackSize(1);
       

    }

    @Override
    public final void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 10, 0, bFull3D, false));


        player.fallDistance = 0;
        //player.capabilities.allowFlying = true;
        player.eyeHeight = 1.25F;
        //player.width = 0.6F;
        //player.height = 1.8F;
        //player.setEntityBoundingBox(new AxisAlignedBB(player.getEntityBoundingBox().minX, player.getEntityBoundingBox().minY, player.getEntityBoundingBox().minZ, player.getEntityBoundingBox().minX + 0.6F, player.getEntityBoundingBox().minY + 1.8F, player.getEntityBoundingBox().minZ + 0.6F));


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {


                if (itemStack.getItem() == RegistryHandler.ModItems.VEHICON_MID_2_HELMET) {
                    if (world.isRemote) {
                        //if (ClientProxy.MY_KEYBINDING.isKeyDown())
                        //{
                        player.inventory.armorInventory.set(3, new ItemStack(RegistryHandler.ModItems.CUSTOM_HELMET));
                        //player.inventory.armorInventory.set(3, new ItemStack(ModItems.VEHICON_ALTMODE_HELMET));

                        //}
                    }
                }
                if (itemStack.getItem() == RegistryHandler.ModItems.VEHICON_MID_2_CHESTPLATE) {
                    if (world.isRemote) {
                        //if (ClientProxy.MY_KEYBINDING.isKeyDown())
                        //{
                        player.inventory.armorInventory.set(2, new ItemStack(RegistryHandler.ModItems.CUSTOM_CHESTPLATE));
                        //player.inventory.armorInventory.set(2, new ItemStack(ModItems.VEHICON_ALTMODE_CHESTPLATE));

                        //}
                    }
                }
                if (itemStack.getItem() == RegistryHandler.ModItems.VEHICON_MID_2_LEGGINGS) {
                    if (world.isRemote) {
                        //if (ClientProxy.MY_KEYBINDING.isKeyDown())
                        //{
                        player.inventory.armorInventory.set(1, new ItemStack(RegistryHandler.ModItems.CUSTOM_LEGGINGS));
                        //player.inventory.armorInventory.set(1, new ItemStack(ModItems.VEHICON_ALTMODE_LEGGINGS));

                        //}
                    }
                }
                if (itemStack.getItem() == RegistryHandler.ModItems.VEHICON_MID_2_BOOTS) {
                    if (world.isRemote) {
                        //if (ClientProxy.MY_KEYBINDING.isKeyDown())
                        //{
                        player.inventory.armorInventory.set(0, new ItemStack(RegistryHandler.ModItems.CUSTOM_BOOTS));
                        //player.inventory.armorInventory.set(0, new ItemStack(ModItems.VEHICON_ALTMODE_BOOTS));

                        //}
                    }
                }
            }
        }, 90);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public final ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {

        if (!itemStack.isEmpty()) {


            if (itemStack.getItem() instanceof ItemArmor) {


            	ArmorTypes.modelVehiconMid.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
            	ArmorTypes.modelVehiconMid.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
            	ArmorTypes.modelVehiconMid.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
            	ArmorTypes.modelVehiconMid.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
            	ArmorTypes.modelVehiconMid.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                ArmorTypes.modelVehiconMid.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
                ArmorTypes.modelVehiconMid.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);


                ArmorTypes.modelVehiconMid.isSneak = _default.isSneak;
                ArmorTypes.modelVehiconMid.isRiding = _default.isRiding;
                ArmorTypes.modelVehiconMid.isChild = _default.isChild;
                ArmorTypes.modelVehiconMid.rightArmPose = _default.rightArmPose;
                ArmorTypes.modelVehiconMid.leftArmPose = _default.leftArmPose;


                return ArmorTypes.modelVehiconMid;
            }
        }
        return null;
    }


}
