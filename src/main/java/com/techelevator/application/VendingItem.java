package com.techelevator.application;

import java.math.BigDecimal;

public class VendingItem {
    private String slot;
    private String itemName;
    private double price;
    private String itemType;
    private int stock;

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemType() {
        return itemType;
    }


    public VendingItem(String slot, String itemName, double price, String itemType) {
        this.slot = slot;
        this.itemName = itemName;
        this.price = price;
        this.itemType = itemType;
        this.stock = 6;

    }

}
