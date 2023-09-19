

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CookieTest {

    @Test
    void getCookieQty() {
        Cookie sugar = new Cookie("sugar", 2, 2.99);
        int quantity = sugar.getCookieQty();
        assertEquals(2, quantity);
    }

    @Test
    void getPricePerDozen() {
        Cookie sugar = new Cookie("sugar", 2, 2.99);
        double price = sugar.getPricePerDozen();
        assertEquals(2.99, price);
    }

    @Test
    void setCookieQty() {
        Cookie sugar = new Cookie("sugar", 2, 2.99);
        sugar.setCookieQty(42);
        int quantity = sugar.getCookieQty();
        assertEquals(42, quantity);
    }

    @Test
    void setPricePerDozen() {
        Cookie sugar = new Cookie("sugar", 2, 2.99);
        sugar.setPricePerDozen(420.69);
        double price = sugar.getPricePerDozen();
        assertEquals(420.69, price);
    }

    @Test
    void calculateCost() {
        Cookie sugar = new Cookie("sugar", 2, 2.99);
        double cost = sugar.calculateCost();
        assertEquals(.498, cost, .001);
    }

    @Test
    void calculateTax() {
        Cookie sugar = new Cookie("jellyBeans", 2, 2.99);
        double tax = sugar.calculateTax(sugar.calculateCost());
        assertEquals(.03, tax, .01);
    }
}