package uk.artdude.tweaks.twisted.common.util;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class TTUtilities {

    /**
     * This function allows you to get the block data from the arguments specified in the arguments.
     * @param modID The modID you want to check for a block from.
     * @param blockName The block name of the block you want to get.
     * @return The block data from the information passed or null if it was not found.
     */
    public static Block getBlock(String modID, String blockName) {
        return GameRegistry.findBlock(modID, blockName);
    }

    /**
     * This function allows you to get the item data from the arguments specified in the arguments.
     * @param modID The modID you want to check for a block from.
     * @param itemName The item name of the block you want to get.
     * @return The item data from the information passed or null if it was not found.
     */
    public static Item getItem(String modID, String itemName) {
        return GameRegistry.findItem(modID, itemName);
    }
}