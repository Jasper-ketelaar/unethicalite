package dev.unethicalite.api.packets;

import dev.unethicalite.api.game.Game;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;

public class WidgetPackets
{
	public static void widgetFirstOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction1Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSecondOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction2Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetThirdOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction3Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFourthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction4Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFifthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction5Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSixthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction6Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSeventhOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction7Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetEighthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction8Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetNinthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction9Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetTenthOption(net.runelite.api.widgets.Widget widget)
	{
		queueWidgetAction10Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetItemAction(net.runelite.api.widgets.WidgetInfo container, net.runelite.api.Item item, java.lang.String action)
	{
		var actions = item.getActions();
		if (actions == null)
		{
			return;
		}
		var index = actions.indexOf(action);
		widgetItemAction(container, item, index);
	}

	public static void widgetItemAction(net.runelite.api.widgets.WidgetInfo container, net.runelite.api.Item item, int index)
	{
		var widgetPackedId = container.getPackedId();
		var itemId = item.getId();
		var itemSlot = item.getSlot();
		switch (index)
		{
			case 0:
				queueWidgetAction1Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 1:
				queueWidgetAction2Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 2:
				queueWidgetAction3Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 3:
				queueWidgetAction4Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 4:
				queueWidgetAction5Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 5:
				queueWidgetAction6Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 6:
				queueWidgetAction7Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 7:
				queueWidgetAction8Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 8:
				queueWidgetAction9Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 9:
				queueWidgetAction10Packet(widgetPackedId, itemId, itemSlot);
				break;
		}
	}

	public static void widgetAction(Widget widget, String action)
	{
		var actions = widget.getActions();
		if (actions == null)
		{
			return;
		}
		var index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				widgetFirstOption(widget);
				break;
			case 1:
				widgetSecondOption(widget);
				break;
			case 2:
				widgetThirdOption(widget);
				break;
			case 3:
				widgetFourthOption(widget);
				break;
			case 4:
				widgetFifthOption(widget);
				break;
			case 5:
				widgetSixthOption(widget);
				break;
			case 6:
				widgetSeventhOption(widget);
				break;
			case 7:
				widgetEighthOption(widget);
				break;
			case 8:
				widgetNinthOption(widget);
				break;
			case 9:
				widgetTenthOption(widget);
				break;
		}
	}

	public static void queueWidgetAction1Packet(int widgetId, int itemId, int childId)
	{
		createFirstAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction2Packet(int widgetId, int itemId, int childId)
	{
		createSecondAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction3Packet(int widgetId, int itemId, int childId)
	{
		createThirdAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction4Packet(int widgetId, int itemId, int childId)
	{
		createFourthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction5Packet(int widgetId, int itemId, int childId)
	{
		createFifthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction6Packet(int widgetId, int itemId, int childId)
	{
		createSixthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction7Packet(int widgetId, int itemId, int childId)
	{
		createSeventhAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction8Packet(int widgetId, int itemId, int childId)
	{
		createEighthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction9Packet(int widgetId, int itemId, int childId)
	{
		createNinthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction10Packet(int widgetId, int itemId, int childId)
	{
		createTenthAction(widgetId, itemId, childId).send();
	}

	public static void queueResumePauseWidgetPacket(int widgetId, int childId)
	{
		createContinuePacket(widgetId, childId).send();
	}

	public static void queueWidgetOnWidgetPacket(int sourceWidgetId, int sourceSlot, int sourceItemId, int destinationWidgetId, int destinationSlot, int destinationItemId)
	{
		createWidgetOnWidget(sourceWidgetId, sourceSlot, sourceItemId, destinationWidgetId, destinationSlot, destinationItemId).send();
	}

	public static PacketBufferNode createType1Action(int widgetId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packet = client.preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
		packet.getPacketBuffer().writeInt(widgetId);
		return packet;
	}

	public static net.runelite.api.packets.PacketBufferNode createDefaultAction(int type, int widgetPackedId, int itemId, int itemSlot)
	{
		switch (type)
		{
			case 1:
				return createFirstAction(widgetPackedId, itemId, itemSlot);
			case 2:
				return createSecondAction(widgetPackedId, itemId, itemSlot);
			case 3:
				return createThirdAction(widgetPackedId, itemId, itemSlot);
			case 4:
				return createFourthAction(widgetPackedId, itemId, itemSlot);
			case 5:
				return createFifthAction(widgetPackedId, itemId, itemSlot);
			case 6:
				return createSixthAction(widgetPackedId, itemId, itemSlot);
			case 7:
				return createSeventhAction(widgetPackedId, itemId, itemSlot);
			case 8:
				return createEighthAction(widgetPackedId, itemId, itemSlot);
			case 9:
				return createNinthAction(widgetPackedId, itemId, itemSlot);
			case 10:
				return createTenthAction(widgetPackedId, itemId, itemSlot);
		}
		throw new java.lang.IllegalArgumentException("Invalid widget action type: " + type);
	}

	public static PacketBufferNode createFirstAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSixthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON6(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSeventhAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON7(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createEighthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON8(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createNinthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON9(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createTenthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createWidgetOnWidget(int sourceWidgetId, int sourceSlot, int sourceItemId, int destinationWidgetId, int destinationSlot, int destinationItemId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTONT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(sourceItemId);
		packetBufferNode.getPacketBuffer().writeIntIME(sourceWidgetId);
		packetBufferNode.getPacketBuffer().writeShortAdd(destinationItemId);
		packetBufferNode.getPacketBuffer().writeShortAddLE(sourceSlot);
		packetBufferNode.getPacketBuffer().writeInt(destinationWidgetId);
		packetBufferNode.getPacketBuffer().writeShortAdd(destinationSlot);
		return packetBufferNode;
	}

	public static PacketBufferNode createContinuePacket(int widgetId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.RESUME_PAUSEBUTTON(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeIntIME(widgetId);
		packetBufferNode.getPacketBuffer().writeShortLE(childId);
		return packetBufferNode;
	}
}