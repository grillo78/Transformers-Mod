package com.marctron.transformersmod.items;

import com.marctron.transformersmod.Main;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemPhaseShifter extends Item {

    protected final String TOOLTIP;
    private PotionEffect[] effects;

    public ItemPhaseShifter(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.tabTransformers);

        TOOLTIP = getUnlocalizedName() + ".tooltip.";
        setMaxStackSize(1);

      
    }

    @Override
    public void onUsingTick(ItemStack stack, EntityLivingBase player, int count) {
        player.noClip = true;

    }
//	@Override
//	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
//			EnumFacing facing, float hitX, float hitY, float hitZ) {
//		player.noClip = true;
//		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
//	}

//	@Override
//	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
//		ItemStack itemstack = playerIn.getHeldItem(handIn);
//		
//		
//		
//		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);		
//	}

    public void addInformation(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag) {
        list.add(TextFormatting.DARK_PURPLE + I18n.format(TextFormatting.BOLD + I18n.format("Mythic")));
    }


//	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
//		
//		ItemStack itemstack = playerIn.getHeldItem(handIn);
//		
//		if (playerIn.noClip = true) {
//			playerIn.noClip = false;
//		} else
//			playerIn.noClip = true;
//		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
//		
//	}


//	public static void onUpdate(World world, EntityPlayer player, ItemStack itemStack, EnumHand hand)
//	{
//		if (ClientProxy.MY_KEYBINDING.isKeyDown()) {
//		
//		
//		player.noClip = true;
//		}
//	}
}
