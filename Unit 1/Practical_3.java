import java.util.Scanner;
public class Practical_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the total bill amount to 0
        double totalBill = 0.0;

        // Ask the user how many items are being purchased
        System.out.print("Enter the number of items: ");
        int numItems = input.nextInt();

        // Process each item
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter product code (1-Seat Covers, 2-Steering Wheel Covers, 3-Car Lighting, 4-Air Purifiers, 5-Other): ");
            int productCode = input.nextInt();

            System.out.print("Enter price of the item: ");
            double price = input.nextDouble();

            double taxRate = 0.0;

            // Determine the tax rate based on the product code
            switch (productCode) {
                case 1:
                    taxRate = 2.0; // Seat covers: 2%
                    break;
                case 2:
                    taxRate = 3.0; // Steering wheel covers: 3%
                    break;
                case 3:
                    taxRate = 4.0; // Car lighting: 4%
                    break;
                case 4:
                    taxRate = 2.5; // Air purifiers: 2.5%
                    break;
                default:
                    taxRate = 1.2; // All other items: 1.2%
                    break;
            }

            // Calculate tax for the current item
            double taxAmount = (price * taxRate) / 100;
            double totalItemCost = price + taxAmount;

            // Add the item's total cost to the bill
            totalBill += totalItemCost;

            // Print the tax details for each item
            System.out.printf("Item %d (Code: %d, Price: Rs. %.2f) - Tax: %.2f%%, Total with tax: Rs. %.2f%n", 
                              (i + 1), productCode, price, taxRate, totalItemCost);
        }

        // Print the final total bill amount
        System.out.printf("Total bill amount: Rs. %.2f%n", totalBill);

        // Close the scanner to avoid resource leaks
        input.close();
    }
}


