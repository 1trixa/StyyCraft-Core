package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (!player.hasPermission("core.day")) {
            player.sendMessage("§§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cKeine Rechte!");
            return false;
        }
        player.setGlowing(true);
        player.sendTitle("§aDein Skin", "§eLeuchtet nun!");
        return false;

    }
}