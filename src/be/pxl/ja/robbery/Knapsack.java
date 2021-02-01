package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;
import be.pxl.ja.robbery.Item;

public class Knapsack<T extends Item> {
    private final double maximumCapacity;
    private final List<T> items;

    public Knapsack(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    public void add (T elt) throws KnapsackFullException {
        if (getCurrentWeight() + elt.getWeight() >= maximumCapacity) {
            throw new KnapsackFullException("Cannot add any more items, knapsack full");
        }
        items.add(elt);
    }

    public double getCurrentWeight() {
        return items.stream().mapToDouble(Item::getWeight).sum();
    }

    public List<T> getItems() {
        return items;
    }
}
