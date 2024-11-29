package exercise.medication;

import java.util.Objects;

public class Medication {
    private String name;
    private double price;
    private boolean isInStock;

    public Medication(String name, double price, boolean isInStock) {
        this.name = name;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(price, that.price) == 0 && isInStock == that.isInStock && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, isInStock);
    }

    @Override
    public String toString() {
        return "Medication: {" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", isInStock = " + isInStock +
                '}';
    }
}
