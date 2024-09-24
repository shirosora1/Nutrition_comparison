import java.util.ArrayList;
import java.util.Scanner;

public class NutritionComparison {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // asks the user for first product
        System.out.println("Give nutritional info per 100g of the first product: ");
        ArrayList<Double> productOneList = new ArrayList<>();
        ArrayList<String> categories = new ArrayList<>();

        categories.add("Calories");
        categories.add("Fat");
        categories.add("Sat fat");
        categories.add("Carbs");
        categories.add("Sugars");
        categories.add("Fibre");
        categories.add("Protein");
        categories.add("salt");

        int index = 0;

        // asks the user for input 8 times and adds to the array list.
        // loops through the categories array to give a label when entering nutrition info
        while (index < categories.size()) {
            System.out.print(categories.get(index) + ": ");
            double firstProduct = scanner.nextDouble();
            index++;

            if (firstProduct < 0) {
                break;
            }
            productOneList.add(firstProduct);
        }
        ProductDetails productOne = new ProductDetails(productOneList.get(0), productOneList.get(1), productOneList.get(2), productOneList.get(3), productOneList.get(4), productOneList.get(5), productOneList.get(6), productOneList.get(7));

        System.out.println(" ");


    // asks the user for the second product


        index = 0;

        System.out.println("Give nutritional info per 100g of the second product: ");
        ArrayList<Double> productTwoList = new ArrayList<>();

        while (index < categories.size()) {
            System.out.print(categories.get(index) + ": ");
            double secondProduct = scanner.nextDouble();
            index++;

            if (secondProduct < 0) {
                break;
            }
            productTwoList.add(secondProduct);
        }
        ProductDetails productTwo = new ProductDetails(productTwoList.get(0), productTwoList.get(1), productTwoList.get(2), productTwoList.get(3), productTwoList.get(4), productTwoList.get(5), productTwoList.get(6), productTwoList.get(7));

        // compare nutrition details - cals, fat, sat fat, sugar, fibre and protein:

        productTwo.compareCalories(productOneList.get(0));
        productTwo.compareFats(productOneList.get(1));
        productTwo.compareSatFats(productOneList.get(2));
        productTwo.compareSugar(productOneList.get(4));
        productTwo.compareFibre(productOneList.get(5));
        productTwo.compareProtein(productOneList.get(6));

        System.out.println(" ");

        productOne.getResult();

    }
}