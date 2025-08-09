package me.ferzic.havenHold.Artifacts.EmberforgedGauntlet;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class EmberforgedGauntletItem extends ItemStack {

    public EmberforgedGauntletItem() {
        super(Material.NETHERITE_HELMET);

        ItemMeta meta = this.getItemMeta();
        meta.lore(
                List.of(
                        Component.text("")
                        
                )
        );

    }

}

