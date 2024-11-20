package MULPACKAGE;

public class MulClass {
    private int num1, num2;

    // Method to set values of data members
    public void setData(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate and display the product
    public void calc_data() {
        int product = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
    }
}
