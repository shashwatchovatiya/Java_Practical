//   !Write program to create an array of company name and another array of price quoted by the company. Fetch the company name who has quoted the lowest

import java.util.Scanner;

public class Practical_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of companies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] companyNames = new String[n];
        double[] prices = new double[n];

        // Input company names and prices
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of company " + (i + 1) + ": ");
            companyNames[i] = scanner.nextLine();

            System.out.print("Enter price quoted by " + companyNames[i] + ": ");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        }

        // Find the company with the lowest price
        int lowestIndex = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < prices[lowestIndex]) {
                lowestIndex = i;
            }
        }

        // Display the result
        System.out.println("\nCompany with the lowest price quote:");
        System.out.println("Company: " + companyNames[lowestIndex]);
        System.out.println("Price: RS. " + prices[lowestIndex]);

        scanner.close();
    }
}

// ?  or another way is

// import java.io.*;
// class Practical_4
// {
//     public static void main(String args[])
//     {
//         String[] companyName = {"Sony", "Airtel", "BSNL", "Idea", "IBM"};
//             int[] price = {1000, 500, 2000, 5000, 700};
//             int i, j = 0;
//             int min = price[0];
//         for (i = 0; i < price.length; i++)
//         {
//             if (price[i] < min)
//             {
//                 j = i;
//                 min = price[j];
//             }
//         }
//         System.out.println ("\n\n Company name with lowest allotted price: " + companyName[j]);
//         System.out.println ("\n\n Smallest element present in the given array: " + min);
//     }
// }