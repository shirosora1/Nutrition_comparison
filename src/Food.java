public class Food {

//    private String name;
//    private int servingSize;
//    private NutritionDetails nutritionDetails;
//
//    public Food(String name, int servingSize, NutritionDetails nutritionDetails) {
//        this.name = name;
//        this.servingSize = servingSize;
//        this.nutritionDetails = nutritionDetails;
//    }
//    public String getDetails() {
//        return name + ", \n" + servingSize + "g per serving";
//    }
    private String name;
    private int servingSize;

    public Food(String name, int servingSize) {
        this.name = name;
        this.servingSize = servingSize;
    }
    public String getDetails() {
        return name + ", \n" + servingSize + "g per serving";
    }
}