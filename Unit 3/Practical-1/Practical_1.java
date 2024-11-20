// ! Create a package P and within that package create class PackClass which have method called findMax() which find maximum value from three numbers. Now import the package within another class DemoClass and now display the maximum number.
import Package.Practical_1_Package; // Import the package and class

public class Practical_1 {
    public static void main(String[] args) {
        // Create an instance of PackClass
        Practical_1_Package packClass = new Practical_1_Package();

        // Define three numbers
        int num1 = 45, num2 = 78, num3 = 32;

        // Find the maximum using the findMax method
        int max = packClass.findmax(num1, num2, num3);

        // Display the maximum number
        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: \n" + max);
    }
}