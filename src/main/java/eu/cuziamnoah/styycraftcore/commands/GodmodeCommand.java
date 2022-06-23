package eu.cuziamnoah.styycraftcore.commands;

import eu.cuziamnoah.styycraftcore.StyyCraftCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodmodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!player.hasPermission("core.godmode")) {
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| Keine Rechte!");
        }
        if (StyyCraftCore.godmodePlayer.contains(player.getUniqueId())) {
            StyyCraftCore.godmodePlayer.remove(player.getUniqueId());
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Der §eGod-Mode §7wurde deaktiviert!");
            player.sendTitle("§aGod-Mode", "§8» §7God-Mode §cdeaktiviert!");

            return true;
        }
            StyyCraftCore.godmodePlayer.add(player.getUniqueId());
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Der §eGod-Mode §7wurde aktiviert!");
            player.sendTitle("§aGod-Mode", "§8» §7God-Mode §aaktiviert!");
            return true;
        }
    }