package uk.artdude.tweaks.twisted.common.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class Galvanized extends Enchantment {

    // The enchantment ID of the enchant. (Can be changed via the configs)
    public static int Enchantment_ID = 200;
    public static Enchantment ENCHANTMENT;

    protected Galvanized() {
        super(Enchantment_ID, 8, EnumEnchantmentType.armor);
        // Set the un-localized name for the enchant.
        this.setName("galvanized");
    }

    @Override
    public int getMinEnchantability(int level) {
        // Set the min enchantability of the enchant.
        return 5 + (level + 1) * 6;
    }

    @Override
    public int getMaxEnchantability(int level) {
        // Set the max enchantability of the enchant.
        return getMinEnchantability(level) + 10;
    }

    @Override
    public int getMaxLevel() {
        // Return the max level of the enchant.
        return 3;
    }

    @Override
    public boolean canApply(ItemStack stack) {
        // Set the enchant can only be applied to Armor pieces.
        return stack.getItem() instanceof ItemArmor;
    }
}