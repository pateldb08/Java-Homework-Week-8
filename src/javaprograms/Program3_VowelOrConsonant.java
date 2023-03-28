package javaprograms;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the   alphabet.
 * Print Vowel of Consonant,
 *    depending on the user input.
 *    If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1,
 *    print an  error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
//public class Program3_VovelOrConsonant {
//     public static void main(String[] args) {
//
//    }
//    public static void vovelOrConsonant(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" please Enter an Alphabet: ");
//
//

public class Program3_VowelOrConsonant {
    public static void main(String[] args) {
        Program3_VowelOrConsonant obj = new Program3_VowelOrConsonant();
        obj.checkVowelOrConsonant();
    }

    public void checkVowelOrConsonant() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a single character: ");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;

        }
        if (i == 1) {
            System.out.println(" Entered charachter " + ch + "is Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Entered character " + ch + " is consonant");
        } else {
            System.out.println("Entered value is not an alphabet, Invalid input");
        }
        Scanner closed;

    }
}

