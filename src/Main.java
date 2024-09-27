import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter details for product one: ");

        int index = 0;

        while (index < 2) {
            System.out.print("Name: ");
            System.out.print("Serving size: ");

            Food firstProduct = new Food(scanner.nextLine(), scanner.nextInt());

            System.out.println(firstProduct);
        }
    }
}