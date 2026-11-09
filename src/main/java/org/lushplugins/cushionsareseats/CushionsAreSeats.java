package org.lushplugins.cushionsareseats;

import org.bukkit.plugin.java.JavaPlugin;

public final class CushionsAreSeats extends JavaPlugin {
    private static CushionsAreSeats plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        // Enable implementation
    }

    @Override
    public void onDisable() {
        // Disable implementation
    }

    public static CushionsAreSeats getInstance() {
        return plugin;
    }
}
