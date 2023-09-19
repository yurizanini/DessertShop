
package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    void getName() {
        Candy Kitkat = new Candy("Kitkat", .25, 2.2);
        String name = Kitkat.getName();
        assertEquals("Kitkat", name);
    }

    @Test
    void setName() {
        Candy Kitkat = new Candy("Kitkat", .25, 2.2);
        Kitkat.setName("Skittles");
        String name = Kitkat.getName();
        assertEquals("Skittles", name);
    }

    @Test
    void getTaxPercent() {
        Candy Kitkat = new Candy("Kitkat", .25, 2.2);
        double tax = Kitkat.getTaxPercent();
        assertEquals(7.25, tax);
    }

    @Test
    void setTaxPercent() {
        Candy Kitkat = new Candy("Kitkat", .25, 2.2);
        Kitkat.setTaxPercent(2.4);
        double tax = Kitkat.getTaxPercent();
        assertEquals(2.4, tax);
    }
}