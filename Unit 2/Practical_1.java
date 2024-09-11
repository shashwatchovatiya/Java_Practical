// !Write a program to sort the elements of one dimensional array. Read value of array elements through command line argument.
import java.util.Arrays;  // Required for Arrays.sort()

class Practical_1 {
    public static void main(String args[]) {
        // Get the length of the arguments array
        int n = args.length;
        
        // Create an integer array to hold the parsed values
        int a[] = new int[n];
        
        // Parse each argument as an integer and store it in the array
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        // Sort the array in ascending order
        Arrays.sort(a);

        // Print the sorted array
        System.out.println("\n***** Ascending Order: *****");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();  // Move to the next line after printing
    }
}
