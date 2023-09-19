

package DessertShop;

public class Cookie extends DessertItem {
    //Attributes
    int cookieQty;
    double pricePerDozen;

    //Constructors
    public Cookie () {
        super();
        int cookieQty = 0;
        double pricePerDozen = 0.0;
    }

    public Cookie (String n, int q, double pd){
        super(n);
        cookieQty = q;
        pricePerDozen = pd;
    }

    //getters
    public int getCookieQty (){
        return cookieQty;
    }
    public double getPricePerDozen(){
        return pricePerDozen;
    }

    //setters
    public void setCookieQty(int q){
        cookieQty = q;
    }

    public void setPricePerDozen(double pd){
        pricePerDozen = pd;
    }

    public double calculateCost() {
    double qty = cookieQty;
        double cost = (qty/12) * pricePerDozen;
    return cost;
    }
}


