package program17_carpetcostcalculator;

public class Carpet {
    private double cost;  // instance variable declaration

    public Carpet(double cost) { // Parameterized constructor initializing variable
        if (cost < 0) {      // Nested if else loop, setting cost value according to conditions in requirements
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }
        public double getCost() {
            return this.cost;
        }

    }

