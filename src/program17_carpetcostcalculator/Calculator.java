package program17_carpetcostcalculator;

public class Calculator {
    private Floor floor;   // instance Variable declaration
    private Carpet carpet;   // Instance Variable declaration

    public Calculator(Floor floor, Carpet carpet){   // Parameterised constructor initializing floor & carpet variables
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() { // Return type method to return total cost by multiplying floor area and carpet cost
       //calling getArea method via object floor and get.cost method via object carpet
        return floor.getArea() * carpet.getCost();
    }


    }

