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
            meta.lore(List.of(
                    Component.text("A weapon powerful in the daylight..."),
                    Component.text("Blind your enemies in 5 hits,")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[BladeOfDawnItem] Meta is null");
        }
    }
}
