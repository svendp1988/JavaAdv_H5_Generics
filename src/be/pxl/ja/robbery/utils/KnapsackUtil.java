package be.pxl.ja.robbery.utils;

import be.pxl.ja.robbery.Inventory;
import be.pxl.ja.robbery.Item;
import be.pxl.ja.robbery.Knapsack;
import be.pxl.ja.robbery.KnapsackFullException;

import java.util.Collections;

public class KnapsackUtil {
    public static <T extends Comparable<T> & Item> void fill(Knapsack<T> knapsack, Inventory<T> inventory) {
        Collections.sort(inventory.getItems());
        inventory.getItems().forEach(item -> {
            try {
                knapsack.add(item);
            } catch (KnapsackFullException e) {
                System.out.printf("%s %nCannot add more products, current weight is already %.0f and by adding %.0f the maximumcapacity would be passed. %n", e, knapsack.getCurrentWeight(), item.getWeight());
            }
        });
    }
}
