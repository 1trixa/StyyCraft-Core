package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NightCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if(!player.hasPermission("core.day")) {
            player.sendMessage("§§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cKeine Rechte!");
            return false;
        }
        player.getLocation().getWorld().setTime(18000);
        player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Die Tageszeit wurde auf §eNacht §7gestellt!");
        player.sendTitle("§aTageszeit gestellt auf", "§8» §eNacht");

        return false;
    }
}
