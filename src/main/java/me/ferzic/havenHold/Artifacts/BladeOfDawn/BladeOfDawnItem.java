package me.ferzic.havenHold.Artifacts.BladeOfDawn;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.List;

public class BladeOfDawnItem extends ItemStack {

    public BladeOfDawnItem() {
        // Set base material
        super(Material.DIAMOND_SWORD);

        ItemMeta meta = this.getItemMeta();

        if (meta != null) {
            meta.lore(List.of(
                        Component.text("")
                    )
            );
        }

    }
}

