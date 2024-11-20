package SUMPACKAGE;

public class SumClass {
    private int num1, num2;

    // Method to set values of data members
    public void setData(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate and display the sum
    public void calc_data() {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
