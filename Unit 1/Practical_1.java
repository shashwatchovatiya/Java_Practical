// import java.util.Scanner;

// public class Practical_1 {

//     public static void main(String[] args) {
//         // Create a Scanner object for taking input
//         Scanner input = new Scanner(System.in);

//         // Prompt the user for the principal amount
//         System.out.print("Enter the principal amount: ");
//         double principal = input.nextDouble();

//         // Prompt the user for the rate of interest
//         System.out.print("Enter the rate of interest (in %): ");
//         double rate = input.nextDouble();

//         // Prompt the user for the time period in years
//         System.out.print("Enter the time period (in years): ");
//         double time = input.nextDouble();

//         // Calculate the simple interest using the formula SI = (P * R * T) / 100
//         double simpleInterest = (principal * rate * time) / 100;

//         // Output the simple interest
//         System.out.println("The Simple Interest is: " + simpleInterest);

//         // Close the scanner to avoid resource leak
//         input.close();
//     }
// }
class Practical_1
{
 public static void main(String args[])
 {

 float P = 50000, R = 3, T = 2;
 float SI = (P * T * R) / 100;
 System.out.println ("Simple interest = " + SI);
 }
}