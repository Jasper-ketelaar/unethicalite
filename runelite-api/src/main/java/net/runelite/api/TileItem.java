/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import dev.unethicalite.api.SceneEntity;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an item inside an {@link ItemLayer}.
 */
public interface TileItem extends Renderable, SceneEntity
{
	/**
	 * @return the ID of the item
	 * @see ItemID
	 */
	int getId();

	int getQuantity();

	/**
	 * @return the tile this item is on
	 */
	Tile getTile();

	void pickup();

	String getName();

	default int distanceTo(Locatable locatable)
	{
		return getTile().distanceTo(locatable.getWorldLocation());
	}

	default int distanceTo(WorldPoint point)
	{
		return getTile().distanceTo(point);
	}

	default WorldPoint getWorldLocation()
	{
		return getTile().getWorldLocation();
	}

	default LocalPoint getLocalLocation()
	{
		return getTile().getLocalLocation();
	}

	boolean isTradable();

	boolean isStackable();

	boolean isMembers();

	int getNotedId();

	boolean isNoted();

	int getStorePrice();

	String[] getInventoryActions();

	default List<String> inventoryActions()
	{
		return Arrays.asList(getInventoryActions());
	}

	default boolean hasInventoryAction(String action)
	{
		return inventoryActions().contains(action);
	}
}
