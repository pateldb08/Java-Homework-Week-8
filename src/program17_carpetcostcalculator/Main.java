package program17_carpetcostcalculator;

public class Main {

   public static void main(String[] args) {

       Carpet carpet = new Carpet(3.5); // Constructor from Carpet class
       Floor floor = new Floor(2.75, 4.0); // Constructor from Floor class
       Calculator calculator = new Calculator(floor, carpet); // Constructor from Calculator class
       System.out.println("total= " + calculator.getTotalCost()); // method from calculator class
       carpet = new Carpet(1.5); // Constructor from Carpet class with different values
       floor = new Floor(5.4, 4.5); // Constructor from Floor class with different values
       calculator = new Calculator(floor, carpet); // Constructor from Calculator class
       System.out.println("total= " + calculator.getTotalCost()); // method from Calculator class
    }
}
