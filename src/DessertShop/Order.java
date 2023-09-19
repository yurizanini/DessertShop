

package DessertShop;

import java.util.ArrayList;

public class Order {

    //attributes
    private ArrayList<DessertItem> orders;

    //constructors
    public Order() {
        orders = new ArrayList<DessertItem>();
    }

    //methods

    public ArrayList<DessertItem> getOrderList() {
        return orders;
    }

    public void addItem(DessertItem d) {
        orders.add(d);
    }

    public int itemCount() {
        return orders.size();
    }

    public double orderCost() {
        double totalCost = 0.0;
        for (DessertItem i : orders) {
            totalCost = totalCost + i.calculateCost();
        }
        return totalCost;
    }

    public double orderTax() {
        double totalTax = 0.0;
        for (DessertItem i : orders) {
            totalTax = totalTax + i.calculateTax(i.calculateCost());
        }
        return totalTax;
    }
}
