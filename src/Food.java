public class Food {
    
    private String name;
    // private int per100g;
    private int servingSize;

    public Food(String name, int servingSize) {
        this.name = name;
        this.servingSize = servingSize;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return name + ", \n" + servingSize + "g per serving";
    }
}
