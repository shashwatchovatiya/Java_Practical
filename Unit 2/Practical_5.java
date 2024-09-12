// ! Write an interface called numbers, with a method in Process(int x, int y). Write a class called Sum, in which the method Process finds the sum of two numbers and returns an int value. Write another class called Average, in which the Process method finds the average of the two numbers and returns an int.
import java.util.Scanner;

// Define an interface called Numbers
interface Numbers {
    // Method to be implemented by other classes
    int Process(int x, int y);
}

// Class Sum that implements Numbers interface and calculates sum
class Sum implements Numbers {
    // Implementation of Process method to find sum of two numbers
    public int Process(int x, int y) {
        return x + y;
    }
}

// Class Average that implements Numbers interface and calculates average
class Average implements Numbers {
    // Implementation of Process method to find average of two numbers
    public int Process(int x, int y) {
        return (x + y) / 2;  // Returns integer average
    }
}

public class Practical_5 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create objects of Sum and Average
        Sum sumOperation = new Sum();
        Average averageOperation = new Average();

        // Perform sum operation
        int sumResult = sumOperation.Process(num1, num2);
        System.out.println("Sum of the two numbers: " + sumResult);

        // Perform average operation
        int avgResult = averageOperation.Process(num1, num2);
        System.out.println("Average of the two numbers: " + avgResult);

        // Close the scanner
        scanner.close();
    }
}
