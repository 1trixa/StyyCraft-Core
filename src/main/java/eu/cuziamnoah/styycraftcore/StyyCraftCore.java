package eu.cuziamnoah.styycraftcore;

import eu.cuziamnoah.styycraftcore.commands.*;
import eu.cuziamnoah.styycraftcore.listener.EntityDamageListener;
import eu.cuziamnoah.styycraftcore.listener.PlayerJoinQuitListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class StyyCraftCore extends JavaPlugin {
    private static StyyCraftCore instance;
    public static List<UUID>godmodePlayer=new ArrayList<>();
    public static StyyCraftCore getInstance() {
        return StyyCraftCore.instance;
    }

    @Override
    public void onEnable() {
        StyyCraftCore.instance = this;
        try {
            this.getCommand("fly").setExecutor(new FlyCommand());
            this.getCommand("reward").setExecutor(new RewardCommand());
            this.getCommand("feed").setExecutor(new FeedCommand());
            this.getCommand("heal").setExecutor(new HealCommand());
            this.getCommand("clearchat").setExecutor(new ClearChatCommand());
            this.getCommand("skull").setExecutor(new SkullCommand());
            this.getCommand("day").setExecutor(new DayCommand());
            this.getCommand("glow").setExecutor(new GlowCommand());
            this.getCommand("godmode").setExecutor(new GodmodeCommand());
            this.getCommand("random").setExecutor(new RandomCommand());

            loadListener(Bukkit.getPluginManager());

            Bukkit.getConsoleSender().sendMessage("§8§m----------------------------------------------");
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage("§bDeveloper §8| §bCuziamNoah");
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage("§6§lWeb: §chttps://cuziamnoah.eu ");
            Bukkit.getConsoleSender().sendMessage("§7Version: §8'§c1.0-SNAPSHOT§8");
            Bukkit.getConsoleSender().sendMessage("§8© §cStyyDev §7| Alle Rechte vorbehalten.");
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage("§a§lStyyCraftCore §awurde aktiviert!");
            Bukkit.getConsoleSender().sendMessage(" ");
            Bukkit.getConsoleSender().sendMessage("§8§m----------------------------------------------");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private void loadListener(final PluginManager pluginManager) {
        pluginManager.registerEvents((Listener) new PlayerJoinQuitListener(), (Plugin) this);
        pluginManager.registerEvents((Listener) new EntityDamageListener(), (Plugin) this);


    }
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8§m----------------------------------------------");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§bDeveloper §8| §bCuziamNoah");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§6§lWeb: §chttps://cuziamnoah.eu ");
        Bukkit.getConsoleSender().sendMessage("§7Version: §8'§c1.0-SNAPSHOT§8");
        Bukkit.getConsoleSender().sendMessage("§8© §cStyyDev &7| Alle Rechte vorbehalten.");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§a§lStyyCraftCore §awurde deaktiviert!");
        Bukkit.getConsoleSender().sendMessage(" ");
        Bukkit.getConsoleSender().sendMessage("§8§m----------------------------------------------");
    }
}
