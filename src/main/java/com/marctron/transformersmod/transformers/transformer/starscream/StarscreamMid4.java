package com.marctron.transformersmod.transformers.transformer.starscream;

import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.transformers.models.starscream.ModelStarscreamMid3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Timer;
import java.util.TimerTask;

public class StarscreamMid4 extends ItemArmor {


    @SideOnly(Side.CLIENT)
    private static ModelStarscreamMid3 model = new ModelStarscreamMid3();


    public StarscreamMid4(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(null);
        setMaxStackSize(1);
        ModItems.ITEMS.add(this);

    }

    @Override


    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 10, 0, bFull3D, false));
        player.fallDistance = 0;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                //Starscream
                if (itemStack.getItem() == ModItems.STARSCREAM_MID4_BOOTS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(0, new ItemStack(ModItems.STARSCREAM_MID5_BOOTS));
                    }
                }

                if (itemStack.getItem() == ModItems.STARSCREAM_MID4_LEGGINGS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(1, new ItemStack(ModItems.STARSCREAM_MID5_LEGGINGS));
                    }
                }

                if (itemStack.getItem() == ModItems.STARSCREAM_MID4_CHESTPLATE) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(2, new ItemStack(ModItems.STARSCREAM_MID5_CHESTPLATE));
                    }
                }

                if (itemStack.getItem() == ModItems.STARSCREAM_MID4_HELMET) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(3, new ItemStack(ModItems.STARSCREAM_MID5_HELMET));
                    }
                }

                //Skywarp
                if (itemStack.getItem() == ModItems.SKYWARP_MID4_BOOTS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(0, new ItemStack(ModItems.SKYWARP_MID5_BOOTS));
                    }
                }

                if (itemStack.getItem() == ModItems.SKYWARP_MID4_LEGGINGS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(1, new ItemStack(ModItems.SKYWARP_MID5_LEGGINGS));
                    }
                }

                if (itemStack.getItem() == ModItems.SKYWARP_MID4_CHESTPLATE) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(2, new ItemStack(ModItems.SKYWARP_MID5_CHESTPLATE));
                    }
                }

                if (itemStack.getItem() == ModItems.SKYWARP_MID4_HELMET) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(3, new ItemStack(ModItems.SKYWARP_MID5_HELMET));
                    }
                }
                //THUNDERCRACKER
                if (itemStack.getItem() == ModItems.THUNDERCRACKER_MID4_BOOTS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(0, new ItemStack(ModItems.THUNDERCRACKER_MID5_BOOTS));
                    }
                }

                if (itemStack.getItem() == ModItems.THUNDERCRACKER_MID4_LEGGINGS) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(1, new ItemStack(ModItems.THUNDERCRACKER_MID5_LEGGINGS));
                    }
                }

                if (itemStack.getItem() == ModItems.THUNDERCRACKER_MID4_CHESTPLATE) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(2, new ItemStack(ModItems.THUNDERCRACKER_MID5_CHESTPLATE));
                    }
                }

                if (itemStack.getItem() == ModItems.THUNDERCRACKER_MID4_HELMET) {
                    if (world.isRemote) {
                        player.inventory.armorInventory.set(3, new ItemStack(ModItems.THUNDERCRACKER_MID5_HELMET));
                    }
                }


            }

        }, 70);

        if (world.isRemote) {

//					if(player.onGround)	{
//						world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX + 0.5, player.posY, player.posZ, 1, 0, 1);
//					}
            if (Minecraft.getMinecraft().gameSettings.keyBindJump.isKeyDown()) {
                //player.limbSwing = 0F;
                //player.limbSwingAmount = 20F;
                player.resetPositionToBB();


                player.motionY += 0.1F;
                player.motionY = Math.min(0.25F, player.motionY);
                if (Minecraft.getMinecraft().gameSettings.keyBindForward.isKeyDown()) {
                    player.setSprinting(false);
                    player.moveRelative(0F, 0F, 0.015F, 3F);
                }

                //player.motionX *= 1.1;
                //player.motionX = Math.min(3, player.motionX);
                //player.motionZ *= 1.1;
                //player.motionZ = Math.min(3, player.motionZ);


                //world.spawnParticle(EnumParticleTypes.SMOKE_LARGE, player.posX, player.posY, player.posZ, 0., -0.3, 0);
//						world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, player.posX, player.posY, player.posZ, 0, -0.3, 0);
//						world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, player.posX + 0.2, player.posY, player.posZ, 0, -0.3, 0);
//						world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, player.posX - 0.2, player.posY, player.posZ, 0, -0.3, 0);
//						world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, player.posX, player.posY, player.posZ + 0.2, 0, -0.3, 0);
//						world.spawnParticle(EnumParticleTypes.DRAGON_BREATH, player.posX, player.posY, player.posZ - 0.2, 0, -0.3, 0);

                world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX, player.posY + 0.15, player.posZ, 0.6D, 0.D, 0.85D);
                world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX + 0.2, player.posY + 0.15, player.posZ, 0.6D, 0.0D, 0.85D);
                world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX - 0.2, player.posY + 0.15, player.posZ, 0.6D, 0.0D, 0.85D);
                world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX, player.posY + 0.15, player.posZ + 0.2, 0.6D, 0.0D, 0.85D);
                world.spawnParticle(EnumParticleTypes.REDSTONE, player.posX, player.posY + 0.15, player.posZ - 0.2, 0.6D, 0.0D, 0.85D);

                world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, player.posX, player.posY, player.posZ, 0., -0.1, 0);
                //world.spawnParticle(EnumParticleTypes.FLAME, player.posX, player.posY, player.posZ, 0, -0.1, 0);


            }
        }
    }

    private void setSize(float f, float f1) {
        f = 0.6f;
        f1 = 2.9f;

    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {

        if (!itemStack.isEmpty()) {


            if (itemStack.getItem() instanceof ItemArmor) {


                model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
                model.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
                model.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
                model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
                model.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);

                model.isSneak = _default.isSneak;
                model.isRiding = _default.isRiding;
                model.isChild = _default.isChild;
                model.rightArmPose = _default.rightArmPose;
                model.leftArmPose = _default.leftArmPose;

                return model;
            }
        }

        return null;
    }
}
	
	


	


