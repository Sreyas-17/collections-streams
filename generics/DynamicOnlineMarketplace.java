package com.bridgelabz.generics;

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }
}

class Books extends Product {
    public Books(String name, double price, String category) {
        super(name, price, category);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price, String category) {
        super(name, price, category);
    }
}

class Gadgets extends Product {
    public Gadgets(String name, double price, String category) {
        super(name, price, category);
    }
}

class Categories {
    public static <T extends Product<?>> void applyDiscount(T product, double discount) {
        double newPrice = product.getPrice() - (product.getPrice() * (discount / 100));
        product.setPrice(newPrice);
    }
}

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
        Books book = new Books("Java Programming", 400, "Science");
        Clothing tshirt = new Clothing("T-Shirt", 200, "Casual");
        Gadgets phone = new Gadgets("Smartphone", 50000, "Electronics");

        System.out.println("Before discount:");
        System.out.println(book.getName() + " Price: " + book.getPrice());
        System.out.println(tshirt.getName() + " Price: " + tshirt.getPrice());
        System.out.println(phone.getName() + " Price: " + phone.getPrice());

        Categories.applyDiscount(book, 10);
        Categories.applyDiscount(tshirt, 15);
        Categories.applyDiscount(phone, 5);

        System.out.println("\nAfter discount:");
        System.out.println(book.getName() + " Price: " + book.getPrice());
        System.out.println(tshirt.getName() + " Price: " + tshirt.getPrice());
        System.out.println(phone.getName() + " Price: " + phone.getPrice());
    }
}
