//5.Write a program to demonstrate single level, multi-level inheritance.

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multi-Level Inheritance
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow is chirping");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Level Inheritance
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark();

        System.out.println();

        // Multi-Level Inheritance
        Sparrow mySparrow = new Sparrow();
        mySparrow.eat();  // Inherited from Animal
        mySparrow.fly();  // Inherited from Bird
        mySparrow.chirp();
    }
}
