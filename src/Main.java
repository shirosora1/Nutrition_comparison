import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter details for products to compare: ");
        System.out.println();

        // Creating food items from scanner input

        // first product

        Food firstProduct = null;
        ProductDetails firstProductDetails = null;
        Food secondProduct = null;
        ProductDetails secondProductDetails = null;

        for (int i = 1; i <= 2; i++) {

            if (i == 1) {
                System.out.println("First product details (per 100g): ");
            } else if (i == 2){
                System.out.println("Second product details (per 100g): ");
            }

            System.out.print("Enter product name: ");
            String name = scanner.nextLine();

            System.out.print("Enter calories: ");
            int calories = scanner.nextInt();

            System.out.print("Enter fat: ");
            double fat = scanner.nextDouble();

            System.out.print("Enter sat fat: ");
            double satFat = scanner.nextDouble();

            System.out.print("Enter carbs: ");
            double carbs = scanner.nextDouble();

            System.out.print("Enter sugars: ");
            double sugars = scanner.nextDouble();

            System.out.print("Enter fibre: ");
            double fibre = scanner.nextDouble();

            System.out.print("Enter protein: ");
            double protein = scanner.nextDouble();

            System.out.print("Enter salt: ");
            double salt = scanner.nextDouble();

            System.out.print("Enter individual serving size: ");
            int servingSize = scanner.nextInt();

            scanner.nextLine();
            System.out.println();

            if (i == 1) {
                firstProduct = new Food(name, servingSize);
                firstProductDetails = new ProductDetails(calories, fat, satFat, carbs, sugars, fibre, protein, salt);
            } else if (i == 2) {
                secondProduct = new Food(name, servingSize);
                secondProductDetails = new ProductDetails(calories, fat, satFat, carbs, sugars, fibre, protein, salt);
            }
        }
    }
}