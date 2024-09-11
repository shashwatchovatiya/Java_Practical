//! Write a java program to scan 3 integer values from the command line argument and display the maximum number using conditional operator
public class Practical_4 {

    public static void main(String[] args) {
        // Check if 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide exactly 3 integer values.");
            return;
        }

        // Parse the command line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // ! Simple Way to find max number of digits
        // Initialize max as num1
        // int max = num1;

        // // Compare num2 with current max
        // if (num2 > max) {
        //     max = num2;
        // }

        // // Compare num3 with current max
        // if (num3 > max) {
        //     max = num3;
        // }

        // ! or Seconde Way is 
        int max = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);


        // Display the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
