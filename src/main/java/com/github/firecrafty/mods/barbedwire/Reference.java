/*
 * File name: Reference.java
 * com.github.firecrafty.mods.barbedwire.Reference
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

/**
 * @author firecrafty
 */
public class Reference
{
    public static final String MOD_ID = "barbedwire";
    public static final String MOD_NAME = "Barbed Wire";

    public static final int VERSION_MAJOR = 0;
    public static final int VERSION_MINOR = 1;
    public static final String VERSION_REVISION = "0-alpha.1";

    public static final String MOD_VERSION = VERSION_MAJOR + "." + VERSION_MINOR + "." + VERSION_REVISION;
    public static final String SERVER_PROXY_CLASS = "com.github.firecrafty.mods.barbedwire.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "com.github.firecrafty.mods.barbedwire.ClientProxy";
    public static final String ASSET_PATH = "/assets/" + MOD_ID + "/";
}

