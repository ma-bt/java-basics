//10.	Provide example on dynamic method dispatch

// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class DynamicDispatchExample {
    public static void main(String[] args) {
        // Creating instances of the superclass and two subclasses
        Animal genericAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the makeSound method on different instances
        genericAnimal.makeSound();  // Calls the method from the superclass
        myDog.makeSound();          // Calls the overridden method in the Dog subclass
        myCat.makeSound();          // Calls the overridden method in the Cat subclass
    }
}
