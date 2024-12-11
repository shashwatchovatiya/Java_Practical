import java.util.*;
public class Practical_1{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number of integers: ");
            int n = scanner.nextInt();
            if (n < 2) {
                System.out.println("At least two numbers are required.");
                return;
            }
            int[] numbers = new int[n];
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }
            Arrays.sort(numbers);
            System.out.println("Lowest: " + numbers[0]);
            System.out.println("Second Lowest: " + numbers[1]);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter integers.");
        }
    }

}