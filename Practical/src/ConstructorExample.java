//8.Provide example on how constructor of super class is called.

// Superclass
class Animal {
    private String species;

    // Parameterized constructor of the superclass
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal constructor called");
    }

    // Getter method
    public String getSpecies() {
        return species;
    }
}

// Subclass
class Dog extends Animal {
    public String breed;

    // Parameterized constructor of the subclass
    public Dog(String species, String breed) {
        super(species); // Calling the constructor of the superclass
        this.breed = breed;
        System.out.println("Dog constructor called");
    }

    // Getter method
    public String getBreed() {
        return breed;
    }
}

// Main class
public class ConstructorExample {
    public static void main(String[] args) {
        // Creating an instance of the subclass
        Dog myDog = new Dog("Canine", "Labrador");

        // Accessing the properties of both superclass and subclass
        System.out.println("Species: " + myDog.getSpecies());
        System.out.println("Breed: " + myDog.getBreed());
    }
}
