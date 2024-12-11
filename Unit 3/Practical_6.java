// !Write a program that takes a string from the user and validate it. The string should be at least 5 characters and should contain at least one digit. Display an appropriate valid message.
import java.util.Scanner;

public class Practical_6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string to validate: ");
        String userInput = scanner.nextLine();

        // Validate the string
        if (isValid(userInput)) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is invalid. It must be at least 5 characters long and contain at least one digit.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a string is valid
    public static boolean isValid(String input) {
        // Check if the string is at least 5 characters long
        if (input.length() < 5) {
            return false;
        }

        // Check if the string contains at least one digit
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }

        // If no digit is found, return false
        return false;
    }
}
