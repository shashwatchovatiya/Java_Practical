// ! A bank gives 6.5% per annum interest on deposits made in that bank.Write a program to calculate the total amount that a person will receive after the end of 5 years for a deposit of Rs.5000 for compound interest.

public class Practical_9 {

    public static void main(String[] args) {
        // Principal amount
        double principal = 5000.0;

        // Annual interest rate (in decimal)
        double annualRate = 6.5 / 100;

        // Number of times interest is compounded per year (annual compounding)
        int timesCompounded = 1;

        // Number of years
        int years = 5;

        // Calculate the compound interest
        double amount = principal * Math.pow(1 + annualRate / timesCompounded, timesCompounded * years);

        // Display the total amount
        System.out.printf("The total amount after %d years is: Rs. %.2f%n", years, amount);
    }
}
