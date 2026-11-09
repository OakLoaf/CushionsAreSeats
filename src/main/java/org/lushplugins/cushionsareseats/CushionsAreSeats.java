package org.lushplugins.cushionsareseats;

import org.bukkit.entity.Cushion;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CushionsAreSeats extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCushionInteract(PlayerInteractAtEntityEvent event) {
        if (event.isCancelled() && event.getRightClicked() instanceof Cushion cushion) {
            if (cushion.getPassengers().isEmpty()) {
                event.setCancelled(false);
            }
        }
    }
}
