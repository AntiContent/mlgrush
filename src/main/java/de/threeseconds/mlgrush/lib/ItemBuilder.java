package de.threeseconds.mlgrush.lib;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemBuilder {

    private Material material;
    private Integer amount;
    private Short durability;
    private String displayName;
    private ArrayList<String> lore;
    private Boolean glow = Boolean.valueOf(false);
    private Boolean unbreakable = Boolean.valueOf(false);

    public ItemBuilder() {}

    public ItemBuilder(Material material){
        this.material = material;
        this.amount = Integer.valueOf(1);
        this.durability = Short.valueOf((short)0);
    }

    public ItemBuilder(Material material, Integer amount){
        this.material = material;
        this.amount = amount;
        this.durability = Short.valueOf((short)0);
    }

    public ItemBuilder(Material material, Integer amount, Short durability){
        this.material = material;
        this.amount = amount;
        this.durability = durability;
    }

    public ItemBuilder(Material material, Integer amount, Short durability, String displayName){
        this.material = material;
        this.amount = amount;
        this.durability = durability;
        this.displayName = displayName;
    }

    public ItemBuilder(Material material, Integer amount, Short durability, String displayName, ArrayList<String> lore){
        this.material = material;
        this.amount = amount;
        this.durability = durability;
        this.displayName = displayName;
        this.lore = lore;
    }

    public ItemStack build() {
        ItemStack itemStack = new ItemStack(this.material, this.amount, this.durability);
        ItemMeta itemMeta = itemStack.getItemMeta();
        if(this.displayName != null){
            itemMeta.setDisplayName(this.displayName);
        }
        if(this.lore != null){
            itemMeta.setLore(this.lore);
        }
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    public void addLore(String lore){
        if(this.lore == null){
            this.lore = new ArrayList<>();
        }
        this.lore.add(lore);
    }

    public void removeLore(int lore){
        if(this.lore == null){
            return;
        }
        this.lore.remove(lore);
    }

    public void removeLore(String lore){
        if(this.lore == null){
            return;
        }
        this.lore.remove(lore);
    }

    public void clearLore(){
        if(this.lore == null){
            return;
        }
        this.lore.clear();
    }

    public void setUnbreakable(Boolean unbreakable) {
        this.unbreakable = unbreakable;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setDurability(Short durability) {
        this.durability = durability;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setLore(ArrayList<String> lore) {
        this.lore = lore;
    }

    public void setGlow(Boolean glow) {
        this.glow = glow;
    }

}
