import java.util.Scanner;

public class ProductInputHandler {

    public static Food getFoodInput(Scanner scanner) {
        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Individual serving size: ");
        int servingSize = scanner.nextInt();
        scanner.nextLine();

        NutritionDetails nutritionDetails = getProductDetails(scanner);

        return new Food(name, servingSize, nutritionDetails);
    }

    // Get nutritional values per 100g from the user
    public static NutritionDetails getProductDetails(Scanner scanner) {
        System.out.println();
        System.out.println("Please enter details (per 100g):");
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

        scanner.nextLine();
        return new NutritionDetails(calories, fat, satFat, carbs, sugars, fibre, protein, salt);
    }
}
