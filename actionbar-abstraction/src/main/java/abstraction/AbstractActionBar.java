package abstraction;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractActionBar {

    private final Map<UUID, BukkitTask> PENDING_MESSAGES = new HashMap<>();

    /**
     * Send to all players
     * @param message message to send
     */
    public void sendAll(String message) {
        for (Player player: Bukkit.getOnlinePlayers()) {
            send(player, message);
        }
    }

    /**
     * Send a message to a specific player
     * @param player target
     * @param message message to send
     */
    public abstract void send(Player player, String message);

    /**
     * send a message to a specific player with a duration
     * @param player target
     * @param message message to send
     * @param duration duration to stay on the screen
     */
    public void send(Player player, String message, int duration, Plugin plugin) {
        if (PENDING_MESSAGES.containsKey(player.getUniqueId()))
            PENDING_MESSAGES.get(player.getUniqueId()).cancel();

        if (duration == -1) {
            send(player, message);
            return;
        }

        final BukkitTask messageTask = new BukkitRunnable() {
            private int count = 0;
            @Override
            public void run() {
                if (count >= (duration - 3)) {
                    this.cancel();
                }
                send(player, message);
                count++;
            }
        }.runTaskTimer(plugin, 0L, 20L);

        PENDING_MESSAGES.put(player.getUniqueId(), messageTask);
    }

}
