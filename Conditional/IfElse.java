import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the scanner
        System.out.print("Enter a number: "); // Prompt the user for input
        int a = sc.nextInt();

        // Part 1: Check if the number is positive, negative, or zero
        if (a > 0) {
            System.out.println(a + " is Positive");
        } else if (a < 0) {
            System.out.println(a + " is Negative");
        } else {
            System.out.println(a + " is Zero");
        }

        // Part 2: Check if someone has a fever based on a temperature value
        double temperature = 103.5;
        if (temperature > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }

        // Part 3: Determine the day of the week based on a number using a switch-case
        System.out.print("Enter a week number (1-7): "); // Prompt for week number
        int weekNumber = sc.nextInt(); // Get the week number

        switch (weekNumber) {
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
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week number");
                break;
        }

        // Part 4: Conditional operator for boolean and integer values
        int d = 63, b = 36;
        boolean x = (d < b) ? true : false;
        int y = (d > b) ? d : b;
        System.out.println("Boolean result: " + x);
        System.out.println("Greater value: " + y);

        // Part 5: Determine if a year is a leap year
        System.out.print("Enter a year: "); // Prompt for year
        int year = sc.nextInt(); // Get the year

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close(); // Close the scanner
    }
}
