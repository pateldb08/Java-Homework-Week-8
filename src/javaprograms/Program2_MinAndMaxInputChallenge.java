package javaprograms;
/*
2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.

 */
import java.util.Scanner;
public class Program2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Program2_MinAndMaxInputChallenge obj = new Program2_MinAndMaxInputChallenge();
        obj.findmaxandmin();

    }
    public void findmaxandmin(){
        int min = 0;
        int max = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){ // while loop will run indefinate time until value is invalid and it will go in else condition and beak statemement will run
            System.out.println("Please Enter Number:");
            if(scanner.hasNextInt()){ //Ask user to enter value and check value you enter is integer is not as we can only total of integer value
                int enteredvalue = scanner.nextInt();
                System.out.println("Valid");
                if(min == 0 && max == 0){ // first time we store value in both min and maximum variable;
                    min = enteredvalue;
                    max = enteredvalue;
                }
                if(enteredvalue>max){ // from second time it will check value enter was greater than max than replace max value with value you entered
                    max = enteredvalue;
                }
                if(enteredvalue<min){ // from second time it will also check value enter was less than min than replace min vlaue with value you entered
                    min = enteredvalue;
                }

            }else {
                System.out.println("Invalid Number");
                System.out.println("Minumum Number is :" + min);
                System.out.println("Maximum Number is :" + max);
                break;
            }
            counter = counter +1;
        }
    }


}
