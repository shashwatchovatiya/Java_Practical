//  ! Create a class called NumberData that accept any array of the five numbers. Create a sub class called Numplay which provides methods for followings:
//? 1. Display numbers entered.
//? 2. Sum of the number.
//? 3. Average of the numbers.
//? 4. Maximum of the numbers.
//? 5. Minimum of the numbers.
//! Create a class that provides menu for above methods. Give choice from the command-line argument.
import java.util.Scanner;

// Superclass that holds the array of five numbers
class NumberData {
    protected int[] numbers;

    // Constructor to initialize the number array
    public NumberData(int[] numbers) {
        if (numbers.length == 5) {
            this.numbers = numbers;
        } else {
            System.out.println("Error: Please provide exactly 5 numbers.");
            System.exit(1);
        }
    }
}

// Subclass that provides methods to manipulate and display the numbers
class NumPlay extends NumberData {

    // Constructor that passes numbers to the superclass
    public NumPlay(int[] numbers) {
        super(numbers);
    }

    // 1. Method to display numbers
    public void displayNumbers() {
        System.out.print("Numbers entered: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 2. Method to compute the sum
    public int sumOfNumbers() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // 3. Method to compute the average
    public double averageOfNumbers() {
        return (double) sumOfNumbers() / numbers.length;
    }

    // 4. Method to find the maximum number
    public int maxOfNumbers() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 5. Method to find the minimum number
    public int minOfNumbers() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}

// Class that provides a menu for the user to select an operation
public class Practical_6_NumberOperationsMenu {

    // Main method that handles user input and selection
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Create an object of NumPlay
        NumPlay numPlay = new NumPlay(numbers);

        // Display menu options for the user
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Numbers");
            System.out.println("2. Sum of Numbers");
            System.out.println("3. Average of Numbers");
            System.out.println("4. Maximum of Numbers");
            System.out.println("5. Minimum of Numbers");
            System.out.println("6. Exit");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            System.out.println("--------------------------------------------------");

            switch (choice) {
                case 1:
                    // Display numbers entered
                    numPlay.displayNumbers();
                    break;
                case 2:
                    // Display sum of numbers
                    System.out.println("Sum of numbers: " + numPlay.sumOfNumbers());
                    break;
                case 3:
                    // Display average of numbers
                    System.out.println("Average of numbers: " + numPlay.averageOfNumbers());
                    break;
                case 4:
                    // Display maximum number
                    System.out.println("Maximum number: " + numPlay.maxOfNumbers());
                    break;
                case 5:
                    // Display minimum number
                    System.out.println("Minimum number: " + numPlay.minOfNumbers());
                    break;
                case 6:
                    // Exit the program
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
