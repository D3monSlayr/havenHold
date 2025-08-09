package me.ferzic.havenHold;

import me.ferzic.havenHold.Commands.CoreCommand;
import me.ferzic.havenHold.Listeners.WelcomeGoodbyeListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class HavenHold extends JavaPlugin {

    private static HavenHold instance;
    private static Logger logger;

    @Override
    public void onEnable() {
        instance = this;
        logger = getLogger();

        Objects.requireNonNull(getCommand("core")).setExecutor(new CoreCommand());
        getServer().getPluginManager().registerEvents(new WelcomeGoodbyeListener(), this);
        logger.info("HavenHold SMP Core has been enabled.");
    }

    @Override
    public void onDisable() {
        logger.info("HavenHold SMP Core has been disabled.");
    }

    public static HavenHold getInstance() {
        return instance;
    }

    public static Logger getPluginLogger() {
        return logger;
    }
}
