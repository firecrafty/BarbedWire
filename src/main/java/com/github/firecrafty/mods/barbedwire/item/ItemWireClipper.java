/*
 * File name: ItemWireClipper.java
 * com.github.firecrafty.mods.barbedwire.item.ItemWireClipper
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

package com.github.firecrafty.mods.barbedwire.item;

import com.github.firecrafty.mods.barbedwire.BWItems;
import com.github.firecrafty.mods.barbedwire.Reference;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


/**
 * @author firecrafty
 */
public class ItemWireClipper extends Item
{
    public ItemWireClipper() {
        this.setMaxStackSize(1);
        this.setCreativeTab(BWItems.tabBarbedWire);
        this.setUnlocalizedName("wireClipper");
        this.setTextureName(Reference.MOD_ID + ":wire_clipper");
    }

    @Override
    public boolean onItemUse(ItemStack tool, EntityPlayer player, World world, int x, int y, int z, int par7, float xFloat, float yFloat, float zFloat)
    {

        if (!player.canPlayerEdit(x, y, z, par7, tool))
        {
            return false;
        }
        if(world.getBlock(x,y,z) == BWItems.barbedWire)
        {
            world.setBlockToAir(x, y, z);
            if(!world.isRemote) {
                world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(BWItems.barbedWire, 1)));
            }

            return true;
        }
        return false;

    }
}
