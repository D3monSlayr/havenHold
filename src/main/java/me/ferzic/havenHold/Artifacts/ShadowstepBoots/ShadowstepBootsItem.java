package me.ferzic.havenHold.Artifacts.ShadowstepBoots;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import  me.ferzic.havenHold.HavenHold;

import java.util.List;

public class ShadowstepBootsItem extends ItemStack {

    public ShadowstepBootsItem() {
        super(Material.NETHERITE_BOOTS);

        ItemMeta meta = this.getItemMeta();

        if(meta != null) {
            meta.displayName(Component.text("§8§lShadow Step Boots"));
            meta.lore(List.of(
                    Component.text("§7Crafted from shadows woven"),
                    Component.text("§7deep in the realm."),
                    Component.text("§7Few can master the step"),
                    Component.text("§7between worlds."),
                    Component.text(""),
                    Component.text("§6Right-click to teleport."),
                    Component.text("§6Moves you a short distance in"),
                    Component.text("§6the direction you're looking.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[ShadowstepItem] Meta is null");
        }
    }
}

