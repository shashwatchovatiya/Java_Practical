// ! Write a java program to store a string STR = “Hello, Good StringMorning”.Find and display the length of the string. Replace the word “Morning” by “Evening” and display the new string (use StringBuffer class)


public class Practical_7{
    public static void main(String[] args) {
        // Step 1: Store the string
        String str = "Hello, Good Morning";

        // Step 2: Find and display the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // Step 3: Replace the word "Morning" by "Evening" using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);

        // Find the position of "Morning"
        int startIndex = stringBuffer.indexOf("Morning");
        int endIndex = startIndex + "Morning".length();

        // Replace "Morning" with "Evening"
        if (startIndex != -1) {
            stringBuffer.replace(startIndex, endIndex, "Evening");
        }

        // Step 4: Display the new string
        System.out.println("New string: " + stringBuffer.toString());
    }
}
