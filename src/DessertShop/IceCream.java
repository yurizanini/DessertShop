
package DessertShop;

public class IceCream extends DessertItem {
   //Attributes
    int scoopCount;
    double pricePerScoop;

    //Constructors
    public IceCream (){
        super();
        int scoopCount = 0;
        double pricePerScoop = 0.0;
    }

    public IceCream (String n, int sc, double ps){
        super (n);
        scoopCount = sc;
        pricePerScoop = ps;
    }

    //getters
    public int getScoopCount(){
        return scoopCount;
    }
    public double getPricePerScoop(){
        return pricePerScoop;
    }

    //setters
    public void setScoopCount(int sc){
        scoopCount = sc;
    }
    public void setPricePerScoop(double ps){
        pricePerScoop = ps;
    }

    public double calculateCost(){
        double cost = scoopCount*pricePerScoop;
        return cost;
    }
}
