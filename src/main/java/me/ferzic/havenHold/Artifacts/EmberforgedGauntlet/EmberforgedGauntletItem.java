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

        if(meta != null) {
            meta.displayName(Component.text("§x§F§F§F§F§F§F§lE§x§E§F§E§F§E§F§lm§x§D§F§D§F§D§F§lb§x§C§F§C§F§C§F§le§x§B§F§B§F§B§F§lr§x§A§F§A§F§A§F§lF§x§A§0§A§0§A§0§lo§x§9§0§9§0§9§0§lr§x§8§0§8§0§8§0§lg§x§7§0§7§0§7§0§le§x§6§0§6§0§6§0§ld §x§4§0§4§0§4§0§lG§x§4§0§4§0§4§0§la§x§4§0§4§0§4§0§lu§x§4§0§4§0§4§0§ln§x§4§0§4§0§4§0§ll§x§4§0§4§0§4§0§le§x§4§0§4§0§4§0§lt"));
            meta.lore(List.of(
                    Component.text("§7Forged from Ember, a rare mineral"),
                    Component.text("§7found deep beneath the world."),
                    Component.text("§7Few can wield its flame without"),
                    Component.text("§7being consumed."),
                    Component.newline(),
                    Component.text("§6Right-click to launch a fireball."),
                    Component.text("§6Ignites targets on hit.")
            ));
            
             meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[BladeOfDawnItem] Meta is null");
        }

    }

}

