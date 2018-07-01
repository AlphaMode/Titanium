/*
 * This file is part of Titanium
 * Copyright (C) 2018, Horizon Studio <contact@hrznstudio.com>, All rights reserved.
 */
package com.hrznstudio.titanium.api.internal;

import com.hrznstudio.titanium.api.IFactory;
import net.minecraft.item.ItemBlock;

public interface IItemBlockFactory {
    IFactory<ItemBlock> getItemBlockFactory();
}