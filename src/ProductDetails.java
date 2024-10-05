import java.util.Scanner;

public class ProductDetails {

    private int calories;
    private double fat;
    private double satFat;
    private double carbs;
    private double sugars;
    private double fibre;
    private double protein;
    private double salt;

    public ProductDetails(int calories, double fat, double satFat, double carbs, double sugars, double fibre, double protein, double salt) {
        this.setCalories(calories);
        this.setFat(fat);
        this.setSatFat(satFat);
        this.setCarbs(carbs);
        this.setSugars(sugars);
        this.setFibre(fibre);
        this.setProtein(protein);
        this.setSalt(salt);
    }

    public String getNutritionalInfo() {
        return "Calories: " + calories + " kcal\n" +
                "Fat: " + fat + "g\n" +
                "of which Saturates: " + satFat + "g\n" +
                "Carbs " + carbs + "g\n" +
                "of which Sugars: " + sugars + "g\n" +
                "Fibre: " + fibre + "g\n" +
                "Protein: " + protein + "g\n" +
                "Salt: " + salt + "g\n";
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setSatFat(double satFat) {
        this.satFat = satFat;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public void setFibre(double fibre) {
        this.fibre = fibre;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }
}
