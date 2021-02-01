package be.pxl.ja.visitlondon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttractionTest {
    Attraction attraction1;
    Attraction attraction2;

    @BeforeEach
    void setUp() {
        attraction1 = new Attraction("attraction1", 2, 8);
        attraction2 = new Attraction("attraction2", 1, 4);
    }

    @Test
    void compareTo() {
        assertTrue(attraction1.compareTo(attraction2) < 0);
    }
}