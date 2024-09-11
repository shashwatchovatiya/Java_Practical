public class Practical_10 {
    public static void main(String[] args) {
        int number = 2;
        
        while (number <= 1024) {
            System.out.println(number);
            number = number << 1; // Left shift by 1, equivalent to multiplying by 2
        }
    }
}