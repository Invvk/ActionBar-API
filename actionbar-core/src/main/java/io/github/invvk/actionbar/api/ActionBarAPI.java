package io.github.invvk.actionbar.api;

import io.github.invvk.actionbar.abstraction.AbstractActionBar;
import io.github.invvk.actionbar.abstraction.Version;
import io.github.invvk.actionbar.version.ActionbarV1_13;
import io.github.invvk.actionbar.version.ActionbarV1_8;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ActionBarAPI {

    private static final AbstractActionBar actionbar;
    private static final Version version;

    static {
        version = Version.findVersion();

        if (version == null)
            throw new RuntimeException("Your version isn't supported.");

        if (version.getVersion() >= 12)
            actionbar = new ActionbarV1_13();
        else
            actionbar = new ActionbarV1_8();
    }

    public static Version getVersion() {
        return version;
    }

    public static void sendToAll(String message) {
        actionbar.sendAll(message);
    }

    public static void send(Player player, String message) {
        actionbar.send(player, message);
    }

    public static void send(Player player, String message, int duration, Plugin plugin) {
        actionbar.send(player, message, duration, plugin);
    }

}
