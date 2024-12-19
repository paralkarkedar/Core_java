// Example for abstraction
package OOPS.Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    // Provide implementation for the abstract method
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main01 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.sleep();     // Output: Sleeping...
    }
}
