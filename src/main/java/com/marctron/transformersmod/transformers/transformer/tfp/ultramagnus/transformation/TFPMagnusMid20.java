package com.marctron.transformersmod.transformers.transformer.tfp.ultramagnus.transformation;




import java.util.List;

import javax.annotation.Nullable;

import com.marctron.transformersmod.transformers.transformer.ItemArmorTransformer;
import com.marctron.transformersmod.transformers.transformer.tfp.ultramagnus.TFPMagnusArmorTypes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TFPMagnusMid20 extends ItemArmorTransformer{
	
	public TFPMagnusMid20(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(null);
		setMaxStackSize(1);
		
	}
	
	
	public void addInformation(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
		list.add(TextFormatting.GRAY + I18n.format(TextFormatting.BOLD + I18n.format("WFC")));
	}
	
	@Override
	public final void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		player.eyeHeight=0.9f;
			if(player.onGround){
					player.motionX=player.motionX * 1.06F;
					player.motionZ=player.motionZ * 1.06F;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public final ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
	
		if(!itemStack.isEmpty())
		{
			
			
			if(itemStack.getItem() instanceof ItemArmor) 
				{
					
					
					
				
					
			
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);

				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.isSneak = _default.isSneak;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.isRiding = _default.isRiding;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.isChild = _default.isChild;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.rightArmPose = _default.rightArmPose;
				TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A.leftArmPose = _default.leftArmPose;

					return TFPMagnusArmorTypes.modelTFPUltraMagnusMid20_A;
				}
			}
			
			return null;
		}

}
