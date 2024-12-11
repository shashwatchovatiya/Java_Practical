import java.util.Scanner;

public class Practical_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a StringBuffer with the input string
        StringBuffer stringBuffer = new StringBuffer(inputString);

        // Display initial capacity of the StringBuffer
        System.out.println("Initial capacity of the string: " + stringBuffer.capacity());

        // Append a new string to the existing string
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        stringBuffer.append(appendString);

        // Display the string after appending and its new capacity
        System.out.println("String after appending: " + stringBuffer.toString());
        System.out.println("Capacity after appending: " + stringBuffer.capacity());

        scanner.close();
    }
}
