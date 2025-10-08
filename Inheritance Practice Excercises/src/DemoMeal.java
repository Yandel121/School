public class DemoMeal extends Meal {
    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.setMealDetails("Lunch");
        meal.setCalories(1500);
        meal.setComponents();
        meal.displayMealDetails();

    }
}
