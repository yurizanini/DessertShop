

package DessertShop;

public class DessertShop {

    public static void main(String[] args) {

        Order desserts = new Order();

        Candy c1 = new Candy("Candy Corn", 1.5, .25);
        desserts.addItem(c1);

        Candy c2 = new Candy("Gummy Bears", .25, .35);
        desserts.addItem(c2);

        Cookie c3 = new Cookie("Chocolate Chip", 6, 3.99);
        desserts.addItem(c3);

        IceCream c4 = new IceCream("Pistachio", 2, .79);
        desserts.addItem(c4);

        Sundae c5 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
        desserts.addItem(c5);

        Cookie c6 = new Cookie("Oatmeal Raisin", 2, 3.45);
        desserts.addItem(c6);

        for (DessertItem d : desserts.getOrderList()) {
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]%n", d.getName(), d.calculateCost(), d.calculateTax(d.calculateCost()));
        }
        System.out.printf("----------------------------------------------%n");
        System.out.printf("Order Subtotals:         $%.2f    [Tax: $%.2f]%n", desserts.orderCost(), desserts.orderTax());
        System.out.printf("Order Total:             $%.2f%n", desserts.orderCost() + desserts.orderTax());
        System.out.printf("Total items in order: %d%n", desserts.itemCount());

    }

}
