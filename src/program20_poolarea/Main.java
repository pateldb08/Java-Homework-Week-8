package program20_poolarea;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10); // Object creation of Rectangle class providing values
        System.out.println("rectangle.width= " + rectangle.getWidth()); // printing width value
        System.out.println("rectangle.length= " + rectangle.getLength()); // printing length value
        System.out.println("rectangle.area= " + rectangle.getArea()); // printing area value
        Cuboid cuboid = new Cuboid(5, 10, 5); // Object creation of Cuboid class providing values
        System.out.println("cuboid.width= " + cuboid.getWidth()); // printing width value
        System.out.println("cuboid.length= " + cuboid.getLength()); // printing length value
        System.out.println("cuboid.area= " + cuboid.getArea()); // printing area value
        System.out.println("cuboid.height= " + cuboid.getHeight()); // printing height value
        System.out.println("cuboid.volume= " + cuboid.getVolume()); // printing volume value


    }
}

