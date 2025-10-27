//File: DemoMel.java
//Author: Yandel Colón Rivera
//Date: 10/10/2025
//Class: COMP 2400 OOP
//Description: Displays the food items details, components and calories
public class DemoMeal extends Meal {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.setMealDetails("Lunch");
        meal.setCalories(1500);
        meal.setComponents();
        meal.displayMealDetails();

        Meal dinner = new Meal();
        dinner.setMealDetails("Dinner");
        dinner.setCalories(2500);
        dinner.setComponents();
        dinner.displayMealDetails();

    }
}
