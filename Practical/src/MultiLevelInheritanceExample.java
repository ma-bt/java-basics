// 7.Provide an example of multi-level inheritance of your choice.

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal is breathing");
    }
}

// Derived class 2
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class MultiLevelInheritanceExample {
    public static void main(String[] args) {
        // Creating an instance of the most derived class
        Dog myDog = new Dog();

        // Accessing methods from all levels of inheritance
        myDog.eat();      // Inherited from Animal
        myDog.breathe();  // Inherited from Mammal
        myDog.bark();     // Specific to Dog
    }
}
