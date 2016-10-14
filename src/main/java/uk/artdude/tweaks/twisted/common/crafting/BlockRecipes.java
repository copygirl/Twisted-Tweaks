package uk.artdude.tweaks.twisted.common.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.artdude.tweaks.twisted.api.TTCBlocks;
import uk.artdude.tweaks.twisted.common.configuration.ConfigurationHelper;

public class BlockRecipes {

    /**
     * This is the main function call to this class.
     */
    public static void init() {
        // Check to see if the Liquid Void block is enabled if so add a recipe to the game.
        if (ConfigurationHelper.enableLiquidVoid) {
            // Add the recipe for the block to the game.
            GameRegistry.addRecipe(new ItemStack(TTCBlocks.liquidVoid, 1, 0),
                    "ibi", "bcb", "ibi", 'i', Items.IRON_INGOT, 'b', Blocks.IRON_BARS, 'c', Blocks.ENDER_CHEST);
        }
    }
}