public class Food {

    private String name;
    private int servingSize;
    private NutritionDetails nutritionDetails;

    public Food(String name, int servingSize, NutritionDetails nutritionDetails) {
        this.name = name;
        this.servingSize = servingSize;
        this.nutritionDetails = nutritionDetails;
    }

    // Getters

    public String getDetails() {
        return name + ", \n" + servingSize + "g per serving" + ", \n" +
                nutritionDetails;
    }
}