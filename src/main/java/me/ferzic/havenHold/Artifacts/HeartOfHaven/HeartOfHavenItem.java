package me.ferzic.havenHold.Artifacts.HeartOfHaven;

import me.ferzic.havenHold.HavenHold;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class HeartOfHavenItem extends ItemStack {

    public HeartOfHavenItem() {
        super(Material.HEART_OF_THE_SEA);

        ItemMeta meta = this.getItemMeta();

        if(meta != null) {
            meta.displayName(Component.text("§c§lHeart Of Haven"));
            meta.lore(List.of(
                    Component.text("§7Founded on a great friendship"),
                    Component.text("§7Shows the importance of an ally."),
                    Component.text(""),
                    Component.text("§6Right Click to"),
                    Component.text("§6heal your allies.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[HeartOfHavenItem] Meta is null");
        }

    }

}
