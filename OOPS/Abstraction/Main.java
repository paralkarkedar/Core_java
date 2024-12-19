
//Example for abstraction
package OOPS.Abstraction;

// Interface
interface Animal {
    void makeSound();
    void sleep();
}

// Implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.sleep();     // Output: Sleeping...
    }
}
