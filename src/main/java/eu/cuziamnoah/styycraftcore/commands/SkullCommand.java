package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class SkullCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!cmd.getName().equalsIgnoreCase("skull")) {
            return false;
        }

        if(!sender.hasPermission("core.skull")) {
            sender.sendMessage("§cNot allowed.");
            return true;
        }

        if(args.length != 1) {
            sender.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cBenutze: §7/skull <Spielername>");
            return true;
        }

        if(!(sender instanceof Player)) {
            sender.sendMessage("§cNur für Spieler!");
            return true;
        }


        ((Player) sender).getInventory().addItem(getHead(args[0]));
        sender.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Du hast einen §eKopf §7erhalten.");
        ((Player) sender).sendTitle("§aKopf", "§8» §fDu hast einen Kopf erhalten!");
        return false;
    }

    public static ItemStack getHead(String headName) {
        ItemStack head = new ItemStack(Material.LEGACY_SKULL_ITEM, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) head.getItemMeta();
        skullMeta.setOwner(headName);
        head.setItemMeta(skullMeta);
        return head;
    }
}
