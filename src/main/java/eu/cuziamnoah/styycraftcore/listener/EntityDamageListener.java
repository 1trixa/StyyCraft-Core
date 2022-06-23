package eu.cuziamnoah.styycraftcore.listener;

import eu.cuziamnoah.styycraftcore.StyyCraftCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageListener implements Listener {

    @EventHandler
    public void entityDamageEvent(EntityDamageEvent entityDamageEvent) {
        if(entityDamageEvent.getEntity()instanceof Player player) {
            if(StyyCraftCore.godmodePlayer.contains(player.getUniqueId())) {
                entityDamageEvent.setCancelled(true);
            }

        }
    }
}
