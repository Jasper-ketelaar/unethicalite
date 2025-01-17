package net.runelite.client.plugins.interaction;

import dev.unethicalite.managers.InputManager;
import dev.unethicalite.managers.interaction.InteractionConfig;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Point;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;

@Singleton
@Slf4j
public class InteractionOverlay extends Overlay
{
	private final InteractionConfig config;
	private final InputManager inputManager;


	@Inject
	public InteractionOverlay(InteractionConfig config, InputManager inputManager)
	{
		this.config = config;
		this.inputManager = inputManager;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);
	}

	@Override
	public Dimension render(Graphics2D g)
	{
		if (config.drawMouse())
		{
			g.setFont(new Font("Tahoma", Font.BOLD, 18));

			OverlayUtil.renderTextLocation(g, new Point(inputManager.getLastClickX() - (g.getFont().getSize() / 3),
					inputManager.getLastClickY() + (g.getFont().getSize() / 3)), "X", Color.WHITE);


			OverlayUtil.renderTextLocation(g,
					new Point(inputManager.getLastMoveX() - (g.getFont().getSize() / 3),
					inputManager.getLastMoveY() + (g.getFont().getSize() / 3)), "X", Color.GREEN);
		}

		return null;
	}
}
