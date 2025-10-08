import java.util.Scanner;

public class Meal {
    protected String mealDetails;
    protected String [] components= new String [5];
    protected int calories;
    public Meal() {
        this.mealDetails = mealDetails;
        this.calories = calories;
    }
    public String  getMealDetails(){
        return mealDetails;

    }
    public int getCalories(){
        return calories;
    }
    public void setMealDetails(String mealDetails) {
        this.mealDetails = mealDetails;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void setComponents () {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < components.length; i++) {
            System.out.println("Enter item" + (i + 1));

            this.components[i] = sc.next();
        }
    }
    public String getComponents(){
        return components[0];
    }

    public void displayMealDetails(){
        System.out.println("Meal Details: "+getMealDetails());
        System.out.println("Calories: "+getCalories());
        displayMealDetails(5);

    }
    public void displayMealDetails(int num){
        for(int i=0;i<num;i++){
            if (num<0 ||num>5) {
                System.out.println("Invalid Meal Details");

            }else
                System.out.println(components[i]);
        }


    }

}
