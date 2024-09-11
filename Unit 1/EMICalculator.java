// 2 practical

public class EMICalculator {

    public static void main(String[] args) {
        // Check if the command line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java EMICalculator <loan_amount>");
            return;
        }
        
        // Parse the loan amount from the command line argument
        double principal = Double.parseDouble(args[0]);
        
        // Define the interest rate and tenure
        double annualInterestRate = 10.0; // Example: 10% annual interest
        int tenureInYears = 5;
        
        // Calculate Simple Interest (SI)
        double simpleInterest = (principal * annualInterestRate * tenureInYears) / 100;
        
        // Calculate Total Amount to be repaid
        double totalAmount = principal + simpleInterest;
        
        // Calculate EMI
        int totalMonths = tenureInYears * 12; // 60 months
        double emi = totalAmount / totalMonths;
        
        // Print the EMI rounded to 2 decimal places
        System.out.printf("The EMI for a loan amount of Rs. %.2f is: Rs. %.2f\n", principal, emi);
    }
}
