package me.ferzic.havenHold.Artifacts.FrostbinderStaff;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class FrostbinderStaffItem {

  public FrostbinderStaffItem() {
  super(Material.STICK);

itemMeta.lore(List.of(
    Component.text("§7Forged from Ember, a rare mineral"), 
    Component.text("§7found deep beneath the world."),
    Component.text("§7Few can wield its flame without"),
    Component.text("§7being consumed."),
    Component.text(""),
    Component.text("§6Right-click to release a frost pulse."),
    Component.text("§6Freezes water into ice and slows"),
    Component.text("§6enemies in a radius.")
));

}
