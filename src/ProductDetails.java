import java.text.DecimalFormat;

public class ProductDetails {
   private double calories;
   private double fat;
   private double satFat;
   private double carbs;
   private double sugars;
   private double fibre;
   private double protein;
   private double salt;

    public ProductDetails(double calories, double fat, double satFat, double carbs, double sugars, double fibre, double protein, double salt) {
    this.calories = calories;
    this.fat = fat;
    this.satFat = satFat;
    this.carbs = carbs;
    this.sugars = sugars;
    this.fibre = fibre;
    this.protein = protein;
    this.salt = salt;
    }

    DecimalFormat decimalFormat = new DecimalFormat("####.#");

    public String toString() {
        return "calories: " + decimalFormat.format(calories) + "kcals, \n"
                + "fat: " + decimalFormat.format(fat) + "g, \n"
                + "sat fat: " + decimalFormat.format(satFat) + "g, \n"
                + "carbs: " + decimalFormat.format(carbs) + "g, \n"
                + "sugars: " + decimalFormat.format(sugars) + "g, \n"
                + "fibre: " + decimalFormat.format(fibre) + "g, \n"
                + "protein: " + decimalFormat.format(protein) + "g, \n"
                + "salt: " + decimalFormat.format(salt) + "g";
    }

    int counterOne = 0;
    int counterTwo = 0;

    // lower calories = good
    public void compareCalories(double productOneCalories) {
        if (productOneCalories < this.calories) {
            System.out.println("Product one has lower cals");
            counterOne++;
        } else if (productOneCalories > this.calories) {
            System.out.println("Product two has lower cals");
            counterTwo++;
        } else {
            System.out.println("same cals");
            counterOne++;
            counterTwo++;
        }
    }

    // lower fat = good
    public void compareFats(double productOneFat) {
        if (productOneFat < this.fat) {
            System.out.println("Product one has less fat");
            counterOne++;
        } else if (productOneFat > this.fat) {
            System.out.println("Product two has less fat");
            counterTwo++;
        } else {
            System.out.println("same fats");
            counterOne++;
            counterTwo++;
        }
    }

    // lower sat fat = good
    public void compareSatFats(double productOneSatFat) {
        if (productOneSatFat < this.satFat) {
            System.out.println("Product one has less sat fat");
            counterOne++;
        } else if (productOneSatFat > this.satFat) {
            System.out.println("Product two has less sat fat");
            counterTwo++;
        } else {
            System.out.println("same sat fats");
            counterOne++;
            counterTwo++;
        }
    }

    // lower sugar = good
    public void compareSugar(double productOneSugars) {
        if (productOneSugars < this.sugars) {
            System.out.println("Product one has less sugar");
            counterOne++;
        } else if (productOneSugars > this.sugars) {
            System.out.println("Product two has less sugar");
            counterTwo++;
        } else {
            System.out.println("same sugars");
            counterOne++;
            counterTwo++;
        }
    }

    // higher fibre = good
    public void compareFibre(double productOneFibre) {
        if (productOneFibre < this.fibre) {
            System.out.println("Product two has higher fibre");
            counterTwo++;
        } else if (productOneFibre > this.fibre) {
            System.out.println("Product one has higher fibre");
            counterOne++;
        } else {
            System.out.println("same fibre");
            counterOne++;
            counterTwo++;
        }
    }

    // higher protein = good
    public void compareProtein(double productOneProtein) {
        if (productOneProtein < this.protein) {
            System.out.println("Product two has higher protein");
            counterTwo++;
        } else if (productOneProtein > this.protein) {
            System.out.println("Product one has higher protein");
            counterOne++;
        } else {
            System.out.println("same protein");
            counterOne++;
            counterTwo++;
        }
    }

    public void getResult() {
        if (counterOne > counterTwo) {
            System.out.println("Product one is the better product");
        } else if (counterOne < counterTwo) {
            System.out.println("Product two is the better product");
        } else {
            System.out.println("They are relatively equal");
        }
    }

}
