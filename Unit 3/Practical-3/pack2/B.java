package pack2;

import pack1.A; // Importing Class A from package pack1

public class B {
    public static void main(String[] args) {
        // Creating an object of Class A
        A a = new A();

        // Accessing the variable and method of Class A
        System.out.println(a.message); // Accessing the instance variable
        a.displayMessage(); // Calling the instance method
    }
}
