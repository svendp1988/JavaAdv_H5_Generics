package be.pxl.ja.robbery;

public class Product implements Item, Comparable<Product> {
    private String name;
    private double weight;
    private double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.getPrice(), price);
    }

    @Override
    public String toString() {
        return name;
    }
}
