import java.util.Scanner;

// Interface Exam with a method Pass(int mark)
interface Exam {
    // Method to check if the student passed based on marks
    boolean Pass(int mark);
}

// Interface Classify with a method Division(int average)
interface Classify {
    // Method to determine division based on average marks
    String Division(int average);
}

// Class Result implements both Exam and Classify interfaces
class Result implements Exam, Classify {

    // Implementing Pass method from Exam interface
    @Override
    public boolean Pass(int mark) {
        // Return true if mark is greater than or equal to 35, else false
        return mark >= 35;
    }

    // Implementing Division method from Classify interface
    @Override
    public String Division(int average) {
        // Determine division based on average
        if (average >= 60) {
            return "First";
        } else if (average >= 50) {
            return "Second";
        } else {
            return "No division";
        }
    }
}

// Main class to demonstrate functionality
public class Practical_8 {
    public static void main(String[] args) {
        // Create an instance of Scanner to get user input
        Scanner sc = new Scanner(System.in);

        // Creating an instance of Result class
        Result result = new Result();

        // Get marks from the user
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Checking if the user has passed based on the marks
        boolean passStatus = result.Pass(marks);
        if (passStatus) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed.");
        }

        // Get average marks from the user for division classification
        System.out.print("Enter your average marks: ");
        int averageMarks = sc.nextInt();

        // Determining division based on average marks
        String division = result.Division(averageMarks);
        System.out.println("Your division is: " + division);

        // Close the scanner
        sc.close();
    }
}
