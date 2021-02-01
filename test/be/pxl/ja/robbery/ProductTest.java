package be.pxl.ja.robbery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    void setUp() {
        product1 = new Product("test", 2.5, 2.5);
        product2 = new Product("test", 5, 5);
        product3 = new Product("test", 7.5, 5);
    }

    @Test
    void compareTo() {
        assertEquals(1, product1.compareTo(product2));
        assertEquals(0, product2.compareTo(product3));
        assertEquals(-1, product3.compareTo(product1));
    }
}