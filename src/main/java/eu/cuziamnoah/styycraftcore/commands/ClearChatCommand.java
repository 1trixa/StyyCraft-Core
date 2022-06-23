package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.*;
import org.bukkit.*;

public class ClearChatCommand implements CommandExecutor
{
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            if (args.length == 0) {
                if (sender.hasPermission("chatclear.use")) {
                    this.clearChat(sender);
                }
                else {
                    sender.sendMessage(("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cKeine Rechte!"));
                }
            }
            else if (args[0].equalsIgnoreCase("reload")) {
                if (sender.hasPermission("chatclear.reload")) {
                    sender.sendMessage("");
                }
                else {
                    sender.sendMessage("");
                }
            }
        }
        else {
            this.clearChat("Server");
        }
        return true;
    }

    private void clearChat(final CommandSender s) {
        this.clearChat(s.getName());
    }

    private void clearChat(final String name) {
        for (final Player player : Bukkit.getOnlinePlayers()) {
            if (!player.hasPermission("chatclear.bypass")) {
                for (int i = 0; i < 100; ++i) {
                    player.sendMessage("");
                }
            }
        }
        Bukkit.broadcastMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Der §eChat §7wurde geleert!");
    }
}
