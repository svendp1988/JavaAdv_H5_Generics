package be.pxl.ja.robbery;

import java.util.ArrayList;
import java.util.List;

public class Inventory <Item> {
    private final List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void add (Item elt) {
        items.add(elt);
    }

    public List<Item> getItems() {
        return items;
    }
}
