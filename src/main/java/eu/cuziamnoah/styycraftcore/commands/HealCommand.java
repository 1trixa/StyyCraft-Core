package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!player.hasPermission("core.heal")) {
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cKeine Rechte!");
            return false;
        }
        player.setHealth(20);
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Du wurdest geheilt!");

        return true;
    }
}