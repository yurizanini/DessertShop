package DessertShop;

public class Candy extends DessertItem {
    //Attributes
    double candyWeight;
    double pricePerPound;

    //Constructors
    public Candy () {
        super();
        double candyWeight = 0.0;
        double pricePerPound = 0.0;
    }

    public Candy (String n, double w, double pp){
        super (n);
        candyWeight = w;
        pricePerPound = pp;
    }

    //getters
    public double getCandyWeight() {
        return candyWeight;
    }

    public double getPricePerPound(){
        return pricePerPound;
    }

    //setters
    public void setCandyWeight(double w){
        candyWeight = w;
    }

    public void setPricePerPound(double pp) {
        pricePerPound = pp;
    }

    @Override
    public double calculateCost() {
        double cost = candyWeight * pricePerPound;
        return cost;
    }
}
