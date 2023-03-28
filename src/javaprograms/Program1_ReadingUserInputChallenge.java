package javaprograms;

import java.util.Scanner;

/*
1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.

 */
public class Program1_ReadingUserInputChallenge {
    public static void main(String[] args) {

       Program1_ReadingUserInputChallenge obj = new Program1_ReadingUserInputChallenge();
       obj.sum();

    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int total = 0;

        while (count <= 10) {
            System.out.println("Enter number: " + count);
            boolean number = scanner.hasNextInt(); // ask for value to enter and check value is integer or not as we can only add interger value.
            if (number) {    // can also do if(scanner.hasNextINt) this will also satisfy condition
                int num = scanner.nextInt();
                total = total + num;   // or we can use total += num; that will give total of 10 numbers as well.
                count++;
            }else {
                System.out.println("Invalid Number");
            }

        }
        System.out.println(" Sum of 10 numbers is: " + total);
        scanner.close();
    }
}
