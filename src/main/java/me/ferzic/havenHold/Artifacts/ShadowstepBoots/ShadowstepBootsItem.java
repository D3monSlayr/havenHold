package me.ferzic.havenHold.Artifacts.ShadowstepBoots;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import  me.ferzic.havenHold.HavenHold;

import java.util.List;

public class ShadowstepBootsItem extends ItemStack {

    public ShadowstepBootsItem() {
        super(Material.GOLDEN_BOOTS);

        ItemMeta meta = this.getItemMeta();

        if(meta != null) {
            meta.displayName(Component.text("§x§F§F§0§0§7§2§lS§x§E§E§0§0§7§0§lh§x§D§D§0§0§6§E§la§x§C§D§0§0§6§D§ld§x§B§C§0§0§6§B§lo§x§A§B§0§0§6§9§lw §x§8§9§0§0§6§5§lS§x§7§9§0§0§6§4§lt§x§6§8§0§0§6§2§le§x§5§7§0§0§6§0§lp §x§5§7§0§0§6§0§lB§x§5§7§0§0§6§0§lo§x§5§7§0§0§6§0§lo§x§5§7§0§0§6§0§lt§x§5§7§0§0§6§0§ls"));
            meta.lore(List.of(
                    Component.text("§7Crafted from shadows woven"),
                    Component.text("§7deep in the realm."),
                    Component.text("§7Few can master the step"),
                    Component.text("§7between worlds."),
                    Component.newline(),
                    Component.text("§6Right-click to teleport."),
                    Component.text("§6Moves you a short distance in"),
                    Component.text("§6the direction you're looking.")
            ));

            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[ShadowstepItem] Meta is null");
        }
    }
}

