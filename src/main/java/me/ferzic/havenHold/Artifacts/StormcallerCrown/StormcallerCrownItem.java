package me.ferzic.havenHold.Artifacts.StormcallerCrown;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class StormcallerCrownItem extends ItemStack {

    public StormcallerCrownItem() {
        super(Material.NETHERITE_HELMET);

        ItemMeta meta = this.getItemMeta();
        if (meta != null) {
            meta.displayName(Component.text("§d§lStorm Caller's Crown"));
            meta.lore(List.of(
                    Component.text("§7Gives the player a power so great"),
                    Component.text("§7A power that only a god has"),
                    Component.text(""),
                    Component.text("§6Right-click to summon"),
                    Component.text("§6a lightning strike from"),
                    Component.text("§6the heavens.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[StormcallerCrownItem] Meta is null");
        }
    }

}
