public class Food {

    private String name;
    private int servingSize;

    public Food(String name, int servingSize) {
        this.name = name;
        this.servingSize = servingSize;
    }

    // Getters

    public String getDetails() {
        return name + ", \n" + servingSize + "g per serving";
    }
}