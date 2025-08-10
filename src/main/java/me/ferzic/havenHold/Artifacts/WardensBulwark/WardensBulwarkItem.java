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
            meta.displayName(Component.text("§a§lThe Warden's Bulwark"));
            meta.lore(List.of(
                    Component.text("§7Crafted from ancient stones"),
                    Component.text("§7imbued with protective magic."),
                    Component.text("§7Few can withstand the storm"),
                    Component.text("§7of arrows and spells."),
                    Component.text(""),
                    Component.text("§6Right-click to create a barrier."),
                    Component.text("§6Blocks all projectiles for 5 seconds.")
            ));

            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.setUnbreakable(true);
            this.setItemMeta(meta);
        } else {
            HavenHold.getPluginLogger().warning("[WardensBulwarkItem] Meta is null");
        }
    }

}
