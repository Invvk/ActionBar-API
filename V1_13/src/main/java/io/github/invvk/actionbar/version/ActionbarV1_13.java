package io.github.invvk.actionbar.version;

import io.github.invvk.actionbar.abstraction.AbstractActionBar;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

public class ActionbarV1_13 extends AbstractActionBar {

    @Override
    public void send(Player player, String message) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }
}
