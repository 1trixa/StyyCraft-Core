package eu.cuziamnoah.styycraftcore.commands;

import java.util.Random;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RandomCommand implements CommandExecutor {
    public RandomCommand() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("random")) {
            if (!sender.hasPermission("core.random")) {
                sender.sendMessage("§cDazu hast du keine Rechte!");
                return true;
            }

            if (args.length != 0) {
                sender.sendMessage("§7Falscher Syntax!");
                return true;
            }

            Integer random = (new Random()).nextInt(Bukkit.getOnlinePlayers().size());
            Player player = (Player)Bukkit.getOnlinePlayers().toArray()[random];
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("§7Der Spieler §a" + player.getDisplayName() + "§7 wurde zufällig ausgewählt!");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
            Bukkit.broadcastMessage("");
        }

        return false;
    }
}