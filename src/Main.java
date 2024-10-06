import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter details for products to compare:");

    // First product
        System.out.println("First product details (per 100g): ");
        Food firstProduct = ProductInputHandler.getFoodInput(scanner);
        NutritionDetails firstProductDetails = ProductInputHandler.getProductDetails(scanner);

        System.out.println();
    // Second product
        System.out.println("Second product details (per 100g): ");
        Food secondProduct = ProductInputHandler.getFoodInput(scanner);
        NutritionDetails secondProductDetails = ProductInputHandler.getProductDetails(scanner);

        System.out.println();
        System.out.println("First product: ");
        System.out.println(firstProduct.getDetails());
        System.out.println(firstProductDetails.getNutritionalInfo());

        System.out.println("Second product: ");
        System.out.println(secondProduct.getDetails());
        System.out.println(secondProductDetails.getNutritionalInfo());
    }
}