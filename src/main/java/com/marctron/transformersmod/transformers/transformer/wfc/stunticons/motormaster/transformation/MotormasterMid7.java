package com.marctron.transformersmod.transformers.transformer.wfc.stunticons.motormaster.transformation;




import java.util.List;

import javax.annotation.Nullable;

import com.marctron.transformersmod.Main;
import com.marctron.transformersmod.transformers.transformer.ArmorTypes;
import com.marctron.transformersmod.transformers.transformer.ItemArmorTransformer;
import com.marctron.transformersmod.transformers.transformer.wfc.stunticons.motormaster.MotormasterArmorTypes;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MotormasterMid7 extends ItemArmorTransformer{
	
	public MotormasterMid7(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
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
					
					
					
				
					
			
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST) || (armorSlot == EntityEquipmentSlot.CHEST);
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);
				MotormasterArmorTypes.modelMotormasterMid7_A.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS);

				MotormasterArmorTypes.modelMotormasterMid7_A.isSneak = _default.isSneak;
				MotormasterArmorTypes.modelMotormasterMid7_A.isRiding = _default.isRiding;
				MotormasterArmorTypes.modelMotormasterMid7_A.isChild = _default.isChild;
				MotormasterArmorTypes.modelMotormasterMid7_A.rightArmPose = _default.rightArmPose;
				MotormasterArmorTypes.modelMotormasterMid7_A.leftArmPose = _default.leftArmPose;

					return MotormasterArmorTypes.modelMotormasterMid7_A;
				}
			}
			
			return null;
		}
}
