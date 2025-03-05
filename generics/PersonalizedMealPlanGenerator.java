package com.bridgelabz.generics;

import java.util.*;

interface MealPlan {
    void displayMeal();
}

class VegetarianMeal implements MealPlan {
    private String name;

    public VegetarianMeal(String name) {
        this.name = name;
    }

    @Override
    public void displayMeal() {
        System.out.println(name);
    }
}

class VeganMeal implements MealPlan {
    private String name;
    public VeganMeal(String name) {
        this.name = name;
    }
    @Override
    public void displayMeal() {
        System.out.println(name);
    }
}

class NonVegMeal implements MealPlan {
    private String name;
    public NonVegMeal(String name) {
        this.name = name;
    }
    @Override
    public void displayMeal() {
        System.out.println(name);
    }
}

class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    public void addMeal(T meal) {
        meals.add(meal);
    }

    public List<T> getMeals() {
        return meals;
    }

    public void displayMeals() {
        for (T meal : meals) {
            meal.displayMeal();
        }
    }

    public static void generateMealPlan(List<? extends MealPlan> meals) {
        System.out.println("\nGenerated Meal Plan:");
        for (MealPlan meal : meals) {
            meal.displayMeal();
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>();
        Meal<VeganMeal> veganMeal = new Meal<>();
        Meal<NonVegMeal> nonVegMeal = new Meal<>();

        vegetarianMeal.addMeal(new VegetarianMeal("Chapathi"));
        vegetarianMeal.addMeal(new VegetarianMeal("Dosa"));

        veganMeal.addMeal(new VeganMeal("Roti"));
        nonVegMeal.addMeal(new NonVegMeal("Chicken 65"));

        System.out.println("\nVegetarian Meals:");
        vegetarianMeal.displayMeals();

        System.out.println("\nVegan Meals:");
        veganMeal.displayMeals();

        System.out.println("\nNon-Veg Meals:");
        nonVegMeal.displayMeals();

        List<MealPlan> allMeals = new ArrayList<>();
        allMeals.addAll(vegetarianMeal.getMeals());
        allMeals.addAll(veganMeal.getMeals());
        allMeals.addAll(nonVegMeal.getMeals());

        Meal.generateMealPlan(allMeals);
    }
}
