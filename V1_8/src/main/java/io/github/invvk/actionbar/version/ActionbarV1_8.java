package io.github.invvk.actionbar.version;

import io.github.invvk.actionbar.abstraction.AbstractActionBar;
import net.minecraft.server.v1_8_R3.ChatComponentText;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionbarV1_8 extends AbstractActionBar {

    @Override
    public void send(Player player, String message) {
        PacketPlayOutChat chat = new PacketPlayOutChat(new ChatComponentText(message), (byte) 2);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket(chat);
    }

}
