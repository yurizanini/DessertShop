

package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void getScoopCount() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        int scoopCount = chocolate.getScoopCount();
        assertEquals(2, scoopCount);
    }

    @Test
    void getPricePerScoop() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        double pricePerScoop = chocolate.getPricePerScoop();
        assertEquals(2.99, pricePerScoop);
    }

    @Test
    void setScoopCount() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        chocolate.setScoopCount(42);
        int scoopCount = chocolate.getScoopCount();
        assertEquals(42, scoopCount);
    }

    @Test
    void setPricePerScoop() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        chocolate.setPricePerScoop(420.69);
        double price = chocolate.getPricePerScoop();
        assertEquals(420.69, price);

    }

    @Test
    void calculateCost() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        double cost = chocolate.calculateCost();
        assertEquals(5.98, cost, .01);
    }

    @Test
    void calculateTax() {
        IceCream chocolate = new IceCream("sunday", 2, 2.99);
        double tax = chocolate.calculateTax(chocolate.calculateCost());
        assertEquals(.434, tax, .001);
    }
}