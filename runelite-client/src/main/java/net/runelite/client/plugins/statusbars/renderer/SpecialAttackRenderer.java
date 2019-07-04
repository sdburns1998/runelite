/*
 * Copyright (c) 2018, Rheon <https://github.com/Rheon-D>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package net.runelite.client.plugins.statusbars.renderer;

import java.awt.Color;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.SpriteID;
import net.runelite.api.VarPlayer;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.statusbars.StatusBarsOverlay;
import net.runelite.client.plugins.statusbars.StatusBarsPlugin;

public class SpecialAttackRenderer extends BarRenderer
{
	private final SpriteManager spriteManager;

	@Inject
	public SpecialAttackRenderer(StatusBarsPlugin plugin, SpriteManager spriteManager)
	{
		super(plugin);
		maximumValue = 100;
		this.spriteManager = spriteManager;
		standardColor = restoreColor = new Color(3, 153, 0, 195);
	}

	@Override
	protected void update(Client client, StatusBarsOverlay overlay)
	{
		icon = spriteManager.getSprite(SpriteID.MINIMAP_ORB_SPECIAL_ICON, 0);
		currentValue = client.getVar(VarPlayer.SPECIAL_ATTACK_PERCENT) / 10;
		restore = 0;
	}
}
