package com.bridgelabz.generics;

import java.util.*;

abstract class WarehouseItem{
    private String name;
    private int quantity;
    private double price;

    public WarehouseItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends WarehouseItem{

    public Electronics(String name, int quantity, double price) {
        super(name, quantity, price);
    }
}

class Groceries extends WarehouseItem{

    public Groceries(String name, int quantity, double price) {
        super(name, quantity, price);
    }
}

class Furniture extends WarehouseItem{

    public Furniture(String name, int quantity, double price) {
        super(name, quantity, price);
    }
}

class Storage<T extends WarehouseItem>{

    List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getName() + " Qty: " + item.getQuantity() + " Price: " + item.getPrice());
        }
    }
}

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        Storage<Groceries> groceries = new Storage<>();
        Storage<Furniture> furniture = new Storage<>();

        electronics.addItem(new Electronics("Laptop", 2,50000));
        electronics.addItem(new Electronics("Smartphone", 3,25000));

        groceries.addItem(new Groceries("Milk", 2,30));
        groceries.addItem(new Groceries("Bread", 3,50));

        furniture.addItem(new Furniture("Sofa", 1,10000));
        furniture.addItem(new Furniture("Table", 2,2000));

        System.out.println("Electronics: ");
        Storage.displayItems(electronics.getItems());

        System.out.println("\nGroceries: ");
        Storage.displayItems(groceries.getItems());

        System.out.println("\nFurniture: ");
        Storage.displayItems(furniture.getItems());

    }
}