import java.util.*;

// Custom Exception for out of range age
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class Practical_3 {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Please provide exactly 5 ages as command-line arguments.");
            }

            int[] ages = new int[5];
            int sum = 0;

            // Parse and validate ages
            for (int i = 0; i < args.length; i++) {
                try {
                    ages[i] = Integer.parseInt(args[i]);
                    validateAge(ages[i]);
                    sum += ages[i];
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Invalid age format: '" + args[i] + "'. Please enter integers only.");
                }
            }

            // Calculate average
            double average = sum / 5.0;
            System.out.printf("The average age is: %.2f\n", average);

        } catch (RangeException e) {
            System.out.println("Range Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    // Method to validate age
    private static void validateAge(int age) throws RangeException {
        if (age < 1 || age > 100) {
            throw new RangeException("Age must be between 1 and 100. You entered: " + age);
        }
    }
}