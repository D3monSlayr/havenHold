package me.ferzic.havenHold;

import me.ferzic.havenHold.Listeners.WelcomeGoodbyeListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class HavenHold extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new WelcomeGoodbyeListener(), this);
        getLogger().fine("HavenHold SMP Core has been enabled.");

    }

    @Override
    public void onDisable() {
        getLogger().fine("HavenHold SMP Core has been disabled.");
    }


}


