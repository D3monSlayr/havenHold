package me.ferzic.havenHold.Artifacts.EmberforgedGauntlet;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class EmberforgedGauntletItem extends ItemStack {

    public EmberforgedGauntletItem() {
        super(Material.NETHERITE_HELMET);

        ItemMeta meta = this.getItemMeta();

        if(meta != null) {
            meta.displayName(Component.text("§f§lEmber Forged Gauntlet"));
            meta.lore(List.of(
                    Component.text("§7Forged from Ember, a rare mineral"),
                    Component.text("§7found deep beneath the world."),
                    Component.text("§7Few can wield its flame without"),
                    Component.text("§7being consumed."),
                    Component.text(""),
                    Component.text("§6Right-click to launch a fireball."),
                    Component.text("§6Ignites targets on hit.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[EmberforgedGaunletItem] Meta is null");
        }

    }

}




