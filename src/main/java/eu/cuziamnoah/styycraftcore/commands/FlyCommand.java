package eu.cuziamnoah.styycraftcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if(!player.hasPermission("core.fly")){
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| Keine Rechte!");
            return false;
        }

        if (player.isFlying()) {
            player.setFlying(false);
            player.setAllowFlight(false);
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §cDu kannst nun nicht mehr fliegen!");

        } else{
            player.setAllowFlight(true);
            player.setFlying(true);
            player.sendMessage("§a§lStyy§2§lCraft§8§l.§7§lnet §8§l| §7Du kannst nun fliegen!");
        }

        return false;
    }
}
