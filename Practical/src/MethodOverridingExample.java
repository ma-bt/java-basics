//9.	Provide example on method overriding condition


// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method from the superclass
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    // New method in the subclass
    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating instances of the superclass and subclass
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Calling the makeSound method on both instances
        genericAnimal.makeSound();  // Calls the method from the superclass
        myDog.makeSound();          // Calls the overridden method in the subclass

        // Calling the fetch method (specific to the subclass)
        myDog.fetch();
    }
}
