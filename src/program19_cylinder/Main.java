package program19_cylinder;

public class Main {

        public static void main(String[] args) {
            Circle circle = new Circle(3.75); // constructor  of Circle class providing value of rddius
            System.out.println("circle.radius= " + circle.getRadius()); // printing radius value
            System.out.println("circle.area= " + circle.getArea()); // printing area value
            Cylinder cylinder = new Cylinder(5.55, 7.25); // Object creation of cylinder class providing values
            System.out.println("cylinder.radius= " + cylinder.getRadius()); // printing radius value
            System.out.println("cylinder.height= " + cylinder.getHeight()); // printing height value
            System.out.println("cylinder.area= " + cylinder.getArea()); // printing area value
            System.out.println("cylinder.volume= " + cylinder.getVolume()); // printing volume value
        }

    }

