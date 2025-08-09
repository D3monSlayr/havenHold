package me.ferzic.havenHold.Listeners;

import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class WelcomeGoodbyeListener implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(Component.text("§aWelcome to the SMP §b§l" + p.getName() + "!"));
        e.joinMessage(Component.text("§b§l" + p.getName() + " §bhas joined the SMP."));
    }

    @EventHandler
    public void PlayerLeave(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(Component.text("§aGoodbye §b§l" + p.getName() + " §4§l:("));
        e.quitMessage(Component.text("§4§l" + p.getName() + " §chas left the game."));
    }
}
