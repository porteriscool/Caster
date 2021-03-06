package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;

public class ItemWaterSword extends ItemSword
{
    public ItemWaterSword()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".watersword");
        setRegistryName("watersword");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
