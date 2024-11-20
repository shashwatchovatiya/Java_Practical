import SUMPACKAGE.SumClass;
import MULPACKAGE.MulClass;

public class Main {
    public static void main(String[] args) {
        // Create an object of SumClass
        SumClass sumObj = new SumClass();
        sumObj.setData(5, 10);  // Set values
        sumObj.calc_data();    // Calculate and display the sum

        // Create an object of MulClass
        MulClass mulObj = new MulClass();
        mulObj.setData(5, 10);  // Set values
        mulObj.calc_data();    // Calculate and display the product
    }
}
