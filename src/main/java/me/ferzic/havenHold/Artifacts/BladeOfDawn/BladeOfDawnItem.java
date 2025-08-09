package me.ferzic.havenHold.Artifacts.BladeOfDawn;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class BladeOfDawnItem extends ItemStack {

    public BladeOfDawnItem() {
        super(Material.DIAMOND_SWORD);

        ItemMeta meta = this.getItemMeta();

        if (meta != null) {
            meta.displayName(Component.text("§x§F§3§F§6§0§0§lB§x§F§3§E§9§0§0§ll§x§F§4§D§C§0§0§la§x§F§4§D§0§0§0§ld§x§F§4§C§3§0§0§le §x§F§5§A§9§0§0§lo§x§F§5§A§9§0§0§lf §x§F§5§A§9§0§0§lD§x§F§5§A§9§0§0§la§x§F§5§A§9§0§0§lw§x§F§5§A§9§0§0§ln"));
            meta.lore(List.of(
                    Component.text("§7A weapon powerful in the daylight..."),
                    Component.text("§6Blind your enemies in 5 hits,"),
                    Component.text("§6Increased damage at day.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[BladeOfDawnItem] Meta is null");
        }
    }
}

