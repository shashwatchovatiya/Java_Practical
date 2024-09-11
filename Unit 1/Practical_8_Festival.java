// !practical 8
// ! A shop during festival season offers a discount 10% for purchase made up to Rs.1,000,12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for purchase value of Rs.1,500 or more. Write a program to implement the above scheme for a given sales and print out the sales and print out the sales value, discount and net amount payable by a customer. Create necessary methods and constructors
import java.util.Scanner;

public class Practical_8_Festival {

    // Method to calculate discount based on sales amount
    public double calculateDiscount(double salesAmount) {
        double discountRate = 0.0;

        if (salesAmount < 1000) {
            discountRate = 0.10; // 10% discount
        } else if (salesAmount < 1500) {
            discountRate = 0.12; // 12% discount
        } else {
            discountRate = 0.15; // 15% discount
        }

        return discountRate;
    }

    // Method to calculate net payable amount
    public double calculateNetAmount(double salesAmount, double discountRate) {
        double discount = salesAmount * discountRate;
        return salesAmount - discount;
    }

    // Method to print the result
    public void printBill(double salesAmount, double discountRate, double netAmount) {
        System.out.println("Sales Amount: Rs." + salesAmount);
        System.out.println("Discount Percentage: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: Rs." + (salesAmount * discountRate));
        System.out.println("Net Amount Payable: Rs." + netAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of FestivalShop
        Practical_8_Festival shop = new Practical_8_Festival();

        // Input sales amount
        System.out.print("Enter the sales amount: Rs.");
        double salesAmount = scanner.nextDouble();

        // Calculate discount and net amount
        double discountRate = shop.calculateDiscount(salesAmount);
        double netAmount = shop.calculateNetAmount(salesAmount, discountRate);

        // Print the bill
        shop.printBill(salesAmount, discountRate, netAmount);

        scanner.close();
    }
}
