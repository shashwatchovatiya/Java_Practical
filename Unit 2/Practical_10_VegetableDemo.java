// !! The abstract Vegetable class has four subclasses named cabbage, carrot and potato. Write an application that demonstrates how to establish this class hierarchy. Declare one instance variable of type string that indicates the color of a vegetable. Create and display instances of these object. Override the toString() method of object to return a string with the name of the vegetable and its color.

// Abstract Vegetable class
abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    @Override
    public abstract String toString();
}

// Cabbage subclass
class Cabbage extends Vegetable {
    public Cabbage(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Cabbage (Color: " + color + ")";
    }
}

// Carrot subclass
class Carrot extends Vegetable {
    public Carrot(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Carrot (Color: " + color + ")";
    }
}

// Potato subclass
class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Potato (Color: " + color + ")";
    }
}

// Main class to demonstrate the vegetable hierarchy
public class Practical_10_VegetableDemo {
    public static void main(String[] args) {
        // Create instances of each vegetable
        Cabbage cabbage = new Cabbage("Green");
        Carrot carrot = new Carrot("Orange");
        Potato potato = new Potato("Brown");

        // Display the vegetables
        System.out.println(cabbage);
        System.out.println(carrot);
        System.out.println(potato);
    }
}