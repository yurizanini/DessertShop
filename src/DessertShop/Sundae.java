
package DessertShop;

public class Sundae extends IceCream{
    //Attributes
    String toppingName;
    double toppingPrice;

    //Constructors
    public Sundae() {
        super();
        String toppingName = "";
        double toppingPrice = 0.0;
    }

    public Sundae (String n, int sc, double ps, String tn, double tp){
        super(n, sc, ps);
        toppingName = tn;
        toppingPrice = tp;
    }

    //getters
    public String getToppingName(){
        return toppingName;
    }

    public double getToppingPrice(){
        return toppingPrice;
    }

    //setters
    public void setToppingName(String tn){
        toppingName = tn;
    }

    public void setToppingPrice(double tp){
        toppingPrice = tp;
    }

    @Override
    public double calculateCost() {
        double cost = pricePerScoop*scoopCount;
        cost = cost + toppingPrice;
        return cost;
    }
}
