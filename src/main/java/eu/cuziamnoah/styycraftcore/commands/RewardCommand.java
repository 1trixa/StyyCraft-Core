package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
public class RewardCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond = new ItemStack(Material.DIAMOND);
            ItemStack bricks = new ItemStack(Material.BRICK);
            bricks.setAmount(20);
            diamond.setAmount(5);
            player.getInventory().addItem(bricks, diamond);
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Du hast deine Belohnung nun erhalten!");
        }

        return true;
    }
}