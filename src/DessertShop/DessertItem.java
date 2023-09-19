

package DessertShop;

public abstract class DessertItem {
    //Attributes
    private String name;
    private double taxPercent = 7.25;

    //Constructors
    public DessertItem() {
        name = "";
    }

    public DessertItem(String n) {
        name = n;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    //setters
    public void setName(String n) {
        name = n;
    }

    public void setTaxPercent(double tp) {
        taxPercent = tp;
    }

    public abstract double calculateCost();

    public double calculateTax(double cost){
        double tax = 0.0;
        tax = cost * (taxPercent/100);
        return tax;
    }

}
