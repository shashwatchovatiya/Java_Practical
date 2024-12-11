import java.util.*;

// Custom Exception for invalid unit format
class UnitFormatException extends Exception {
    public UnitFormatException(String message) {
        super(message);
    }
}

public class Practical_4 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide exactly 2 arguments: a number and a unit ('centimeter' or 'meter').");
            }

            // Parse the number
            double value;
            try {
                value = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid number format: '" + args[0] + "'. Please enter a valid number.");
            }

            // Check the unit and perform conversion
            String unit = args[1].toLowerCase();
            switch (unit) {
                case "centimeter":
                    System.out.printf("%.2f centimeters is equivalent to %.2f meters.%n", value, value / 100);
                    break;
                case "meter":
                    System.out.printf("%.2f meters is equivalent to %.2f centimeters.%n", value, value * 100);
                    break;
                default:
                    throw new UnitFormatException("Invalid unit format: '" + args[1] + "'. Use 'centimeter' or 'meter'.");
            }

        } catch (UnitFormatException e) {
            System.out.println("Unit Format Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
