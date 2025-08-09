package me.ferzic.havenHold.Artifacts.WardensBulwark;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class WardensBulwarkItem extends ItemStack{

    public WardensBulwarkItem() {
        super(Material.SHIELD);

        ItemMeta meta = this.getItemMeta();

        if (meta != null) {
            meta.displayName(Component.text("§x§0§2§0§0§A§B§lW§x§0§2§0§7§A§3§la§x§0§2§0§E§9§A§lr§x§0§1§1§4§9§2§ld§x§0§1§1§B§8§A§le§x§0§1§2§2§8§1§ln§x§0§1§2§9§7§9§l'§x§0§0§2§F§7§1§ls §x§0§0§3§D§6§0§lB§x§0§0§3§D§6§0§lu§x§0§0§3§D§6§0§ll§x§0§0§3§D§6§0§lw§x§0§0§3§D§6§0§la§x§0§0§3§D§6§0§lr§x§0§0§3§D§6§0§lk"));
            meta.lore(List.of(
                    Component.text("§7Crafted from ancient stones"),
                    Component.text("§7imbued with protective magic."),
                    Component.text("§7Few can withstand the storm"),
                    Component.text("§7of arrows and spells."),
                    Component.newline(),
                    Component.text("§6Right-click to create a barrier."),
                    Component.text("§6Blocks all projectiles for 5 seconds.")
            ));

            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[WardensBulwarkItem] Meta is null");
        }
    }

}
