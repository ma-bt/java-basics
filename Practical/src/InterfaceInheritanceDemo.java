//14.	Demonstrate inheritance in interface (extending the interface)

// Base interface
interface Shape {
    void draw(); // Abstract method for drawing a shape
}

// Extended interface inheriting from Shape
interface ColorfulShape extends Shape {
    void setColor(String color); // Additional abstract method for setting the color
}

// Concrete class implementing the extended interface
class Circle implements ColorfulShape {
    private String color;

    // Implementation of the draw method from Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implementation of the setColor method from ColorfulShape interface
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting color to: " + color);
    }

    // Additional method specific to Circle class
    void displayInfo() {
        System.out.println("Circle information:");
        System.out.println("Color: " + color);
    }
}

// Main class
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of the class implementing the extended interface
        Circle circle = new Circle();

        // Calling methods from both interfaces and the concrete class
        circle.draw(); // From Shape interface
        circle.setColor("Blue"); // From ColorfulShape interface
        circle.displayInfo(); // Specific to Circle class
    }
}
