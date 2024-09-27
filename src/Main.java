import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter details for products to compare: ");
        System.out.println();

        // Creating food items from scanner input

        // first product

        System.out.print("Enter the name of product one: ");
        String name = scanner.nextLine();
        System.out.print("Serving size in grams: ");
        int servingSize = scanner.nextInt();

        Food firstProduct = new Food(name, servingSize);
        System.out.println();
        System.out.println(firstProduct.getDetails());

    }
}