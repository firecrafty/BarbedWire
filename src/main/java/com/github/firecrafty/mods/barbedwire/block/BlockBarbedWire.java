/*
 * File name: BlockBarbedWire.java
 * com.github.firecrafty.mods.barbedwire.block.BlockBarbedWire
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

package com.github.firecrafty.mods.barbedwire.block;

import com.github.firecrafty.mods.barbedwire.BWItems;
import com.github.firecrafty.mods.barbedwire.Reference;
import net.minecraft.block.BlockWeb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * @author firecrafty
 */
public class BlockBarbedWire extends BlockWeb
{
    public BlockBarbedWire()
    {
        this.setBlockName("barbedWire");
        this.setCreativeTab(BWItems.tabBarbedWire);
        this.setBlockTextureName(Reference.MOD_ID + ":barbed_wire");
        this.setBlockUnbreakable();
    }

    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        super.onEntityCollidedWithBlock(world, x, y, z, entity);
        entity.attackEntityFrom(BWItems.barbedWireDamage, 3);
    }


}
