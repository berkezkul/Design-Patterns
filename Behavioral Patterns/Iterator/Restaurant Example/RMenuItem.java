public class RMenuItem {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public RMenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public boolean isVegetarian() { return vegetarian; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Name: " + name + ", Description: " + description +
                ", Vegetarian: " + vegetarian + ", Price: " + price;
    }

}
