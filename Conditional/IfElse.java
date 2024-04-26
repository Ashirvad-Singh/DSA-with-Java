package Conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the scanner
        System.out.print("Enter a number: "); // Prompt the user for input
        int a = sc.nextInt();

// 1-check if the number is positive or negative
        // Get the user's input

        // Conditional check to determine if the number is positive or negative
        if (a > 0) {
        System.out.println(a + " is Positive"); // Corrected output message
        } else if (a < 0) { // Added additional condition for clarity
        System.out.println(a + " is Negative");
        } else { // This is for zero values
        System.out.println(a + " is Zero");
        }

        
 // 2-You have a fever if your temperature is above 100 and otherwise prints You
        // don't have a fever.
        double temperature = 103.5;
        if (temperature > 100) {
        System.out.println("You have a fever");
        } else {
        System.out.println("You don't have a fever");
        }

// 3-Write a Java program to input week number(1-7) and print day of week name
        // using switch case.

        switch (a) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Chutiye ho kya");
                break;
        }
//4-
    }
}
