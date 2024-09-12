// ! Declare an abstract class Vehicle with an abstract method named numWheels().provide subclasses Car and Truck that each implements this method. Create instance of these subclasses and demonstrate the use of this method

// Abstract class Vehicle
abstract class Vehicle {
    // Abstract method that must be implemented by subclasses
    public abstract int numWheels();
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    // Implementation of numWheels for Car
    @Override
    public int numWheels() {
        return 4; // A car typically has 4 wheels
    }
}

// Subclass Truck that extends Vehicle
class Truck extends Vehicle {
    // Implementation of numWheels for Truck
    @Override 
    // ? In Java, @Override is an annotation used to indicate that a method in a subclass is meant to override a method in its superclass. It tells the compiler that you intend to provide a new implementation for an existing method (either abstract or concrete) from the superclass or an interface.
    public int numWheels() {
        return 6; // A truck typically has 6 wheels
    }
}

// Main class to demonstrate the use of subclasses
public class Practical_7 {
    public static void main(String[] args) {
        // Creating instances of Car and Truck
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        // Displaying the number of wheels for each instance
        System.out.println("A car has " + myCar.numWheels() + " wheels.");
        System.out.println("A truck has " + myTruck.numWheels() + " wheels.");
    }
}
