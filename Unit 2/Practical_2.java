//! Write a program to create an array to store 5 integer values. Also initialize the array with 5 numbers and display the array Elements in reverse order.
public class Practical_2 {
    public static void main(String[] args) {
        // Create and initialize an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Display the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // New line for better formatting
        
        // Display the array elements in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // New line for better formatting
    }
}