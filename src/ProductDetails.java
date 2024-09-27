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
        this.calories = calories;
        this.fat = fat;
        this.satFat = satFat;
        this.carbs = carbs;
        this.sugars = sugars;
        this.fibre = fibre;
        this.protein = protein;
        this.salt = salt;
    }
}
