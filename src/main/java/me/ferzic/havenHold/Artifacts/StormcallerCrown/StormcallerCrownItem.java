package me.ferzic.havenHold.Artifacts.StormcallerCrown;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class StormcallerCrownItem extends ItemStack {

    public StormcallerCrownItem() {
        super(Material.GOLDEN_HELMET);

        ItemMeta meta = this.getItemMeta();
        if (meta != null) {
            meta.displayName(Component.text("§x§5§F§5§F§5§F§lS§x§5§A§5§A§5§A§lt§x§5§4§5§4§5§4§lo§x§4§F§4§F§4§F§lr§x§4§9§4§9§4§9§lm §x§3§F§3§F§3§F§lC§x§3§9§3§9§3§9§la§x§3§4§3§4§3§4§ll§x§2§E§2§E§2§E§ll§x§2§9§2§9§2§9§le§x§2§9§2§9§2§9§lr§x§2§9§2§9§2§9§l'§x§2§9§2§9§2§9§ls §x§2§9§2§9§2§9§lC§x§2§9§2§9§2§9§lr§x§2§9§2§9§2§9§lo§x§2§9§2§9§2§9§lw§x§2§9§2§9§2§9§ln"));
            meta.lore(List.of(
                    Component.text("§7Gives the player a power so great"),
                    Component.text("§7A power that only a god has"),
                    Component.newline(),
                    Component.text("§6Right-click to summon"),
                    Component.text("§6a lightning strike from"),
                    Component.text("§6the heavens.")
            ));

            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[StormcallerCrownItem] Meta is null");
        }
    }

}
