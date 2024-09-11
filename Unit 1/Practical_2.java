public class Practical_2{

    public static void main(String[] args) {
        // Check if the user provided a loan amount (X) as a command line argument
        if (args.length != 1) {
            System.out.println("Please provide the loan amount as a command line argument.");
            return;
        }

        // Parse the loan amount (X) from the command line argument
        double loanAmount = Double.parseDouble(args[0]);

        // Interest rate and time period for loan repayment
        double annualInterestRate = 1.0; // Assuming 10% annual interest
        double timeInYears = 5.0; // Time in years (5 years)
        // int months = 60; // Total number of months (5 years)

        // Calculate the simple interest using the formula: SI = (P * R * T) / 100
        double simpleInterest = (loanAmount * annualInterestRate * timeInYears) / 100;

        // Total amount to be repaid is the sum of principal and interest
        double totalAmountToBeRepaid = loanAmount + simpleInterest;

        // EMI is the total amount divided by the number of months
        double emi = totalAmountToBeRepaid / 12 ; // or ask the mam which is the month right 60 or 12

        // Print the calculated EMI
        System.out.printf("The EMI for the loan amount Rs. %.2f is: Rs. %.2f per month%n", loanAmount, emi);
    }
}
