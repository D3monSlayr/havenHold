package me.ferzic.havenHold.Commands;

import me.ferzic.havenHold.Artifacts.BladeOfDawn.BladeOfDawnItem;
import me.ferzic.havenHold.Artifacts.EmberforgedGauntlet.EmberforgedGauntletItem;
import me.ferzic.havenHold.Artifacts.FrostbinderStaff.FrostbinderStaffItem;
import me.ferzic.havenHold.Artifacts.ShadowstepBoots.ShadowstepBootsItem;
import me.ferzic.havenHold.Artifacts.WardensBulwark.WardensBulwarkItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CoreCommand implements TabExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command,
                             @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("§4Only players can use this command!");
            return true;
        }

        if (args.length == 0) {
            player.sendMessage("§cUsage: /core <give|version>");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "give" -> {
                if (args.length < 2) {
                    player.sendMessage("§cUsage: /core give <item>");
                    return true;
                }

                String itemName = args[1].toLowerCase();
                switch (itemName) {
                    case "bladeofdawn" -> {
                        player.getInventory().addItem(new BladeOfDawnItem());
                        player.sendMessage("§6You have received the Blade of Dawn!");
                    }
                    case "emberforgedgaunlet" -> {
                        player.getInventory().addItem(new EmberforgedGauntletItem());
                        player.sendMessage("§6You have received the Ember Forged Gaunlet!");
                    }
                    case "frostbinderstaff" -> {
                        player.getInventory().addItem(new FrostbinderStaffItem());
                        player.sendMessage("§6You have received the Frost Binder's Staff!");
                    }
                    case "shadowstepboots" -> {
                        player.getInventory().addItem(new ShadowstepBootsItem());
                        player.sendMessage("§6You have received the Shadow Step Boots!");
                    }
                    case "wardensbulwark" -> {
                        player.getInventory().addItem(new WardensBulwarkItem());
                        player.sendMessage("§6You have received the Warden's Bulwark!");
                    }
                    default -> {
                        player.sendMessage("§cUnknown item: " + args[1]);
                    }
                }
            }
            case "version" -> {
                player.sendMessage("§aHavenHold SMP version: §f1.0");
            }
            default -> player.sendMessage("§cUnknown subcommand. Use: /core <give|version>");
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command,
                                                @NotNull String alias, @NotNull String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            // Suggest top-level commands
            List<String> subCommands = List.of("give", "version");
            for (String sub : subCommands) {
                if (sub.toLowerCase().startsWith(args[0].toLowerCase())) {
                    completions.add(sub);
                }
            }
        } else if (args.length == 2 && args[0].equalsIgnoreCase("give")) {
            // Suggest actual artifact item names
            List<String> items = List.of(
                    "BladeOfDawn",
                    "EmberforgedGauntlet",
                    "FrostbinderStaff",
                    "ShadowstepBoots",
                    "WardensBulwark"
            );
            for (String item : items) {
                if (item.toLowerCase().startsWith(args[1].toLowerCase())) {
                    completions.add(item);
                }
            }
        }

        return completions;
    }

}
