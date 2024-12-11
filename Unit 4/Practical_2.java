import java.util.*;

// Custom Exception for out of range marks
class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class Practical_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input marks for three subjects
            System.out.print("Enter marks for Subject 1: ");
            int marks1 = scanner.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int marks2 = scanner.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int marks3 = scanner.nextInt();

            // Validate marks
            validateMarks(marks1);
            validateMarks(marks2);
            validateMarks(marks3);

            // Check pass or fail
            if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
                int totalMarks = marks1 + marks2 + marks3;
                double percentage = (totalMarks / 3.0);
                System.out.println("PASS");
                System.out.printf("Percentage: %.2f%%\n", percentage);
            } else {
                System.out.println("FAIL");
            }

        } catch (RangeException e) {
            System.out.println("Range Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter only integers between 0 and 100.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Method to validate marks
    private static void validateMarks(int marks) throws RangeException {
        if (marks < 0 || marks > 100) {
            throw new RangeException("Marks must be between 0 and 100. You entered: " + marks);
        }
    }
}
