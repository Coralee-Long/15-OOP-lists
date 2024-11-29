package exercise.sack;

public class Item {
    private int id;
    private String name;
    private double weightInKg;

    public Item(int id, String name, double weightInKg) {
        this.id = id;
        this.name = name;
        this.weightInKg = weightInKg;
    }

    public Item(int id, String name, double weightInKg, int index) {
        this.id = id;
        this.name = name;
        this.weightInKg = weightInKg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    @Override
    public String toString() {
        return "Item: { " +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "weight = " + weightInKg + "kg " +
                '}';
    }
}






