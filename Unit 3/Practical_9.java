import java.util.Scanner;

public class Practical_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int choice;
        do {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Display string in uppercase");
            System.out.println("2. Display string in lowercase");
            System.out.println("3. Check for equality with another string");
            System.out.println("4. Display substring from a given string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Convert to uppercase
                    System.out.println("Uppercase: " + inputString.toUpperCase());
                    break;

                case 2:
                    // Convert to lowercase
                    System.out.println("Lowercase: " + inputString.toLowerCase());
                    break;

                case 3:
                    // Check for equality with another string
                    System.out.print("Enter another string to compare: ");
                    String anotherString = scanner.nextLine();
                    if (inputString.equals(anotherString)) {
                        System.out.println("The strings are equal.");
                    } else {
                        System.out.println("The strings are not equal.");
                    }
                    break;

                case 4:
                    // Display a substring
                    System.out.print("Enter the starting index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter the ending index: ");
                    int endIndex = scanner.nextInt();

                    try {
                        String substring = inputString.substring(startIndex, endIndex);
                        System.out.println("Substring: " + substring);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid indices. Please try again.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
