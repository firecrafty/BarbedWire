/*
 * File name: Items.java
 * com.github.firecrafty.mods.barbedwire.Items
 *
 * Copyright (C) 2016 firecrafty
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.firecrafty.mods.barbedwire;

import com.github.firecrafty.mods.barbedwire.block.BlockBarbedWire;
import com.github.firecrafty.mods.barbedwire.item.ItemWireClipper;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import org.apache.logging.log4j.Logger;

/**
 * @author firecrafty
 */
public class BWItems
{
    public static final CreativeTabs tabBarbedWire = new CreativeTabs("barbedWire") {
        @Override
        public Item getTabIconItem() {
            return Items.diamond;
        }
    };
    //Barbed wire damage source
    public static DamageSource barbedWireDamage = new DamageSource("barbedWire");

    //BWItems
    public static Item metalBarbs;
    public static ItemWireClipper wireClipper;

    //Blocks
    public static BlockBarbedWire barbedWire;

    public static void addBlocksAndItems(Logger logger)
    {
        logger.info("Creating items...");

        //instantiate items
        metalBarbs = new Item().setUnlocalizedName("barbsMetal").setCreativeTab(tabBarbedWire).setTextureName(Reference.MOD_ID +":barbs_metal");
        wireClipper = new ItemWireClipper();

        //Blocks
        barbedWire = new BlockBarbedWire();

        logger.info("BWItems created!");
        logger.info("Registering items...");
        //BWItems
        GameRegistry.registerItem(metalBarbs, metalBarbs.getUnlocalizedName());
        GameRegistry.registerItem(wireClipper, wireClipper.getUnlocalizedName());
        //Blocks
        GameRegistry.registerBlock(barbedWire, barbedWire.getUnlocalizedName());

        logger.info("Finished item registration!");
    }
}
