// ! Write a program to calculate the hypotenuse of right angled triangle when other sides of the triangle are given. (Hypotenuse = square root (x*x + Y *Y))
import java.util.Scanner;

public class Practical_5{

    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the lengths of the two sides
        System.out.print("Enter the length of side x: ");
        double x = input.nextDouble();

        System.out.print("Enter the length of side y: ");
        double y = input.nextDouble();

        // Calculate the hypotenuse using the formula: hypotenuse = sqrt(x^2 + y^2)
        double hypotenuse = Math.sqrt((x * x) + (y * y));

        // Display the calculated hypotenuse
        System.out.printf("The hypotenuse of the right-angled triangle is: %.2f%n", hypotenuse);

        // Close the scanner
        input.close();
    }
}
