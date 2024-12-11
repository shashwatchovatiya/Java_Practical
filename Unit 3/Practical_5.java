// ! Write a program that accepts a string from command line and perform following operations: 
// ! 1. Display each character on separate line in reverse order.
// ! 2. Count total number of characters and display each character's position too.
// 3. Identify that whether the string is palindrome or not.f Count total number of uppercase and lowercase characters in it.

import java.util.Scanner;

public class Practical_5 {

    public static void main(String[] args) {
        // Accept string input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // 1. Display each character on a separate line in reverse order
        System.out.println("\nCharacters in reverse order:");
        for (int i = userInput.length() - 1; i >= 0; i--) {
            System.out.println(userInput.charAt(i));
        }

        // 2. Count total number of characters and display each character's position
        System.out.println("\nCharacter positions:");
        int totalCharacters = userInput.length();
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println("Position " + (i + 1) + ": " + userInput.charAt(i));
        }
        System.out.println("\nTotal number of characters: " + totalCharacters);

        // 3. Check if the string is a palindrome
        String reversed = new StringBuilder(userInput).reverse().toString();
        boolean isPalindrome = userInput.equals(reversed);
        System.out.println("\nIs the string a palindrome? " + (isPalindrome ? "Yes" : "No"));

        // Count uppercase and lowercase characters
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (char c : userInput.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            }
        }
        System.out.println("\nTotal uppercase characters: " + uppercaseCount);
        System.out.println("Total lowercase characters: " + lowercaseCount);

        scanner.close();
    }
}
