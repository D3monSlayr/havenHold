package me.ferzic.havenHold.Artifacts.HeartOfHaven;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class HeartOfHavenItem extends ItemStack {

    public HeartOfHavenItem() {
        super(Material.HEART_OF_THE_SEA);

        ItemMeta meta = this.getItemMeta();

        if(meta != null) {
            meta.displayName(Component.text("§x§F§F§F§F§F§F§lH§x§F§C§F§D§E§5§le§x§F§9§F§A§C§B§la§x§F§7§F§8§B§2§lr§x§F§4§F§5§9§8§lt §x§F§1§F§3§7§E§lO§x§F§1§F§3§7§E§lf §x§F§1§F§3§7§E§lH§x§F§1§F§3§7§E§la§x§F§1§F§3§7§E§lv§x§F§1§F§3§7§E§le§x§F§1§F§3§7§E§ln"));
            meta.lore(List.of(
                    Component.text("§7Founded on a great friendship"),
                    Component.text("§7Shows the importance of an ally."),
                    Component.newline(),
                    Component.text("§6Right Click to"),
                    Component.text("§6heal your allies.")
            ));

            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[HeartOfHavenItem] Meta is null");
        }

    }

}
