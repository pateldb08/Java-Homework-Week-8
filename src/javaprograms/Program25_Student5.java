package javaprograms;

public class Program25_Student5 {
    int id;
    String name;
    int age;
    // creating two arg constructor
    Program25_Student5(int i, String n){
       id = 1;
       name = n;
    }
    // crating three args constructor
    Program25_Student5(int i, String n,int a){
        id = 1;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id + " " +name+" "+age);
    }

    public static void main(String[] args) {
        Program25_Student5 s1 = new Program25_Student5(111,"Karan");
        Program25_Student5 s2 = new Program25_Student5(222 ,"Aryan" , 25);
        s1.display();
        s2.display();
    }
}
