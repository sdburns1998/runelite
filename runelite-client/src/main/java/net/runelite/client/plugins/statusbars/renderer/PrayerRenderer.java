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
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.client.game.SkillIconManager;
import net.runelite.client.plugins.statusbars.StatusBarsOverlay;
import net.runelite.client.plugins.statusbars.StatusBarsPlugin;
import net.runelite.client.util.ImageUtil;

public class PrayerRenderer extends BarRenderer
{
	private static final Color COLOR_STANDARD = new Color(50, 200, 200, 175);
	private static final Color COLOR_ACTIVE = new Color(57, 255, 186, 225);
	private static final int SIZE = 17;

	@Inject
	public PrayerRenderer(StatusBarsPlugin plugin, SkillIconManager iconManager)
	{
		super(plugin);
		icon = ImageUtil.resizeImage(iconManager.getSkillImage(Skill.PRAYER, true), SIZE, SIZE);
		restoreColor = new Color(57, 255, 186, 75);
	}

	@Override
	protected void update(Client client, StatusBarsOverlay overlay)
	{
		maximumValue = client.getRealSkillLevel(Skill.PRAYER);
		currentValue = client.getBoostedSkillLevel(Skill.PRAYER);
		standardColor = client.getVar(Varbits.QUICK_PRAYER) == 1 ? COLOR_ACTIVE : COLOR_STANDARD;
		restore = overlay.getRestoreValue(Skill.PRAYER.getName());
	}
}
