package P17carpetcostcalculator;

public class Carpet {
    double cost;
// if else condition with 'this' key word
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return this.cost;
    }
}
