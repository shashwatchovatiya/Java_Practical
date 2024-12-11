// ! Write a java program to convert an integer number into its binary and octal equivalent.
import java.util.Scanner;

public class Practical_8 {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Convert the number to its binary equivalent
        String binary = Integer.toBinaryString(number);
        // Convert the number to its octal equivalent
        String octal = Integer.toOctalString(number);

        // Display the results
        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);

        // Close the scanner
        scanner.close();
    }
}
