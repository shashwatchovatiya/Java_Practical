//! Write a program that creates three different classes in three different packages and access them from default package. All the three packages should be at the same level 

// File: PackageAccessDemo.java
import Package1.MathOperations;
import Package2.StringManipulator;
import Package3.DateFormatter;

public class Practical_2 {
    public static void main(String[] args) {
        // Create instances of classes from different packages
        MathOperations mathOps = new MathOperations();
        StringManipulator strManipulator = new StringManipulator();
        DateFormatter dateFormat = new DateFormatter();

        // Demonstrate method calls
        System.out.println("Addition: " + mathOps.add(5, 3));
        System.out.println("Reversed String: " + strManipulator.reverseString("Hello"));
        System.out.println("Current Date: " + dateFormat.getCurrentDate());
    }
}
