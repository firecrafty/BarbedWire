/*
 * File name: FencedOff.java
 * com.github.firecrafty.mods.barbedwire.BarbedWire
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

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * @author firecrafty
 */

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)

public class BarbedWire
{

    public static final Logger LOG = LogManager.getLogger(Reference.MOD_NAME);

    @Mod.Instance(value = Reference.MOD_ID)
    public static BarbedWire instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {//config, blocks + items, gameregistry
        Setup.addBlocksAndItems(LOG);
    }
    @Mod.EventHandler
    public void load(FMLInitializationEvent event)///recipes
    {
        Setup.registerRecipes(LOG);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
