package eu.cuziamnoah.styycraftcore.listener;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener {
    @EventHandler
    public void onJoin(final PlayerJoinEvent playerJoinEvent) {
        final Player player = playerJoinEvent.getPlayer();
        playerJoinEvent.setJoinMessage(null);
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Herzlich Willkommen!");
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Wir freuen uns, dass du da bist!");
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §eshop.styycraft.net §8- §7Shop");
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §estyycraft.net/discord §8- §7Discord");
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Ränge, Booster und Shards gibt's im §e/shop");

        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 2.0f);

    }

    @EventHandler
    public void onQuit(final PlayerQuitEvent playerQuitEvent) {
        final Player player = playerQuitEvent.getPlayer();
        playerQuitEvent.setQuitMessage(null);
    }
}
