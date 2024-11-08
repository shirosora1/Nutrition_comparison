import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // First product
        System.out.println("Enter First product details - ");
        Food firstProduct = ProductInputHandler.getFoodInput(scanner);


    // Second product
        System.out.println("Enter Second product details - ");
        Food secondProduct = ProductInputHandler.getFoodInput(scanner);


        System.out.println();
        System.out.println("First product: ");
        System.out.println(firstProduct.getDetails());


        System.out.println("Second product: ");
        System.out.println(secondProduct.getDetails());

    }
}