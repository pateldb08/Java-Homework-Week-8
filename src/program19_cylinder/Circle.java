package program19_cylinder;

public class Circle {
    double radius;  //  Instance variable declaration

    public Circle(double radius){  // parameterised constructor declaration
        if (radius<0){              // instead of else-if method ternary operator can be used like,
            this.radius = 0;       // this.radius = radius < 0 ? 0 : radius;
                                   // ternary operator setting variable to 0 if 0 has been entered
        }else {
            this.radius= radius;
        }
    }
    public double getRadius() {       // method returning value of radius
        return radius;
    }
    public double getArea(){       // method returning value of area
        return getRadius() * getRadius() * Math.PI;    // area of circle = PI*r*r
    }
}
