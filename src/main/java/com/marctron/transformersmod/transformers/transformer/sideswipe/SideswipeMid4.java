package com.marctron.transformersmod.transformers.transformer.sideswipe;

import java.util.Timer;
import java.util.TimerTask;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.init.ModItems;
import com.marctron.transformersmod.transformers.models.sideswipe.ModelSideswipeMid2;
import com.marctron.transformersmod.util.interfaces.IHasModel;

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

public class SideswipeMid4 extends ItemArmor implements IHasModel {

	public SideswipeMid4(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(null);
		setMaxStackSize(1);
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 10, 0, bFull3D, false));
			
			
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				
				@Override
				public void run() {
			
					player.eyeHeight = 1.25F;
					
					if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_HELMET) {
						if (world.isRemote) 
						{
								player.inventory.armorInventory.set(3, new ItemStack(ModItems.SIDESWIPE_MID3_HELMET));
						}	
					} 
					if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_CHESTPLATE) {
						if (world.isRemote) 
						{
								player.inventory.armorInventory.set(2, new ItemStack(ModItems.SIDESWIPE_MID3_CHESTPLATE));
						}
					} 
					if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_LEGGINGS) {
						if (world.isRemote) 
						{
								player.inventory.armorInventory.set(1, new ItemStack(ModItems.SIDESWIPE_MID3_LEGGINGS));
						}
					} 
					if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_BOOTS) {
						if (world.isRemote) 
						{
								player.inventory.armorInventory.set(0, new ItemStack(ModItems.SIDESWIPE_MID3_BOOTS));
						}
					} 
				}
					
				}, 60);
			
			
			player.eyeHeight = 1.25F;
			
			if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_HELMET) {
				if (world.isRemote) 
				{
						player.inventory.armorInventory.set(3, new ItemStack(ModItems.SIDESWIPE_MID3_HELMET));
				}	
			} 
			if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_CHESTPLATE) {
				if (world.isRemote) 
				{
						player.inventory.armorInventory.set(2, new ItemStack(ModItems.SIDESWIPE_MID3_CHESTPLATE));
				}
			} 
			if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_LEGGINGS) {
				if (world.isRemote) 
				{
						player.inventory.armorInventory.set(1, new ItemStack(ModItems.SIDESWIPE_MID3_LEGGINGS));
				}
			} 
			if (itemStack.getItem() == ModItems.SIDESWIPE_MID4_BOOTS) {
				if (world.isRemote) 
				{
						player.inventory.armorInventory.set(0, new ItemStack(ModItems.SIDESWIPE_MID3_BOOTS));
				}
			} 
		}
			
//			if (itemStack.getItem() == ModItems.SIDESWIPE_CHESTPLATE) 
//			{
//				if (world.isRemote) 
//				{
//			
//			player.width = 0.6F; 
//			player.height = 1.5F;
//			player.setEntityBoundingBox(new AxisAlignedBB(player.getEntityBoundingBox().minX, player.getEntityBoundingBox().minY, player.getEntityBoundingBox().minZ, player.getEntityBoundingBox().minX + 0.6F, player.getEntityBoundingBox().minY + 1.5F, player.getEntityBoundingBox().minZ + 0.6F));
//		
//				}
//			} 
	
				
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	
	@SideOnly(Side.CLIENT)
	private static ModelSideswipeMid2 model = new ModelSideswipeMid2();
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
	
		if(!itemStack.isEmpty())
		{
			
			
			if(itemStack.getItem() instanceof ItemArmor) 
				{
					
					
					
					
			
					model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
					model.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
					model.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST);
					model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
					model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
					model.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
					model.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.FEET);
							
			
					
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