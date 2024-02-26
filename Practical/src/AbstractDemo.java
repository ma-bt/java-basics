//12.	Create an abstract class Calculation which has one normal method int add(int x, int y) 
//which will calculate the sum of x and y and return the results and one abstract 
//method int mul (int x, int y) that performs multiplication. Create a class Demo that inherit abstract class 
//that implement all the abstract method, and it have its own method int calcDiv(int x, int y) that 
//calculates the division between x and y and return the result. Now create the object of Demo and demonstrate 
//the above scenario. After this access the method of abstract class using reference of abstract class. 

// Abstract class
abstract class Calculation {
    // Normal method to add two numbers
    int add(int x, int y) {
        return x + y;
    }

    // Abstract method to multiply two numbers (to be implemented by subclasses)
    abstract int mul(int x, int y);
}

// Concrete subclass
class Demo extends Calculation {
    // Implementation of the abstract method to perform multiplication
    @Override
    int mul(int x, int y) {
        return x * y;
    }

    // Additional method to calculate division
    int calcDiv(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}

// Main class
public class AbstractDemo {
    public static void main(String[] args) {
        // Creating an instance of the concrete subclass
        Demo demoObject = new Demo();

        // Demonstrating the methods from the concrete subclass
        System.out.println("Addition: " + demoObject.add(5, 3));
        System.out.println("Multiplication: " + demoObject.mul(4, 7));
        System.out.println("Division: " + demoObject.calcDiv(20, 4));

        // Accessing the method of the abstract class using the reference of the abstract class
        Calculation abstractReference = demoObject;
        System.out.println("Addition (via abstract reference): " + abstractReference.add(8, 2));
//        System.out.println("Nasla Maharjan 23486");
        System.out.println("Tibra Shrestha 23512");


        // Note: The abstract reference can only access the methods declared in the abstract class.
        // The concrete subclass methods are still available when using the concrete subclass reference.
    }
}
