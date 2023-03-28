package program19_cylinder;

public class Cylinder extends Circle{

    private double height; // double type Instance variable declaration

    public Cylinder(double radius, double height) { // Parameterised constructor
                                               // initializing instance variable by ,
        super(radius);                              // Calling constructor from parent class
        this.height = height < 0 ? 0 : height;      // setting value of height using ternary operator -
                                                    // in case entered value is 0
    }
    public double getHeight() { // method returning value of height
        return this.height;
    }
    public double getVolume(){ // method returning calculated volume
        return getArea() * getHeight();    // volume of circle = multily area with height
    }
}
