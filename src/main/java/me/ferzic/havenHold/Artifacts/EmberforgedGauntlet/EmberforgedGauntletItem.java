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
      itemMeta.lore(List.of(
    Component.text("§7Forged in the chaos of HavenHold,"), 
    Component.text("§7this gauntlet holds a fragment of"),
    Component.text("§7an ancient fire spirit."),
    Component.text(""),
    Component.text("§6Right-click to launch a fireball."),
    Component.text("§6Ignites targets on hit.")
));

                        
                )
        );

    }

}


