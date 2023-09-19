
package DessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void getCandyWeight() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        double weight = jellyBeans.getCandyWeight();
        assertEquals(2.50, weight);
    }

    @Test
    void getPricePerPound() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        double price = jellyBeans.getPricePerPound();
        assertEquals(2.99, price);
    }

    @Test
    void setCandyWeight() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        jellyBeans.setCandyWeight(69.69);
        double weight = jellyBeans.getCandyWeight();
        assertEquals(69.69, weight);
    }

    @Test
    void setPricePerPound() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        jellyBeans.setPricePerPound(420.69);
        double price = jellyBeans.getPricePerPound();
        assertEquals(420.69, price);
    }

    @Test
    void calculateCost() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        double cost = jellyBeans.calculateCost();
        assertEquals(7.475, cost, .001);
    }

    @Test
    void calculateTax() {
        Candy jellyBeans = new Candy("jellyBeans", 2.50, 2.99);
        double tax = jellyBeans.calculateTax(jellyBeans.calculateCost());
        assertEquals(.54, tax, .01);
    }
}