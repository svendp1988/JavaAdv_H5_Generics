package be.pxl.ja.robbery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {
    Knapsack<Product> knapsack;
    Product product1 = new Product("product1", 12, 5);
    Product product2 = new Product("product2", 10, 7);
    Product product3 = new Product("product3", 15, 15);

    @BeforeEach
    void setUp() {
        knapsack = new Knapsack<>(25);
    }

    @Test
    void getCurrentWeightReturnsCorrectWeight() throws KnapsackFullException {
        knapsack.add(product1);
        knapsack.add(product2);
        double expectedWeight = product1.getWeight() + product2.getWeight();
        assertEquals(expectedWeight, knapsack.getCurrentWeight());
    }

    @Test
    void addingMoreThanMaximumCapacityThrowsKnapsackFullException() throws KnapsackFullException {
        knapsack.add(product1);
        knapsack.add(product2);
        assertThrows(KnapsackFullException.class, () -> knapsack.add(product3));
    }
}