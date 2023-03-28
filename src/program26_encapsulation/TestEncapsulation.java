package program26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting value of the variables
        obj.setName("Darshna");
        obj.setAge(21);
        obj.setRollNo(8);

        // Display value of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());

        // direct access of the class is not possible due to encapsulation


    }
}
