//13.	Demonstrate multiple inheritance using interface

// Interface 1
interface Shape {
    void draw(); // Abstract method for drawing a shape
}

// Interface 2
interface Color {
    void setColor(String color); // Abstract method for setting the color
}

// Concrete class implementing both interfaces
class Circle implements Shape, Color {
    private String color;

    // Implementation of the draw method from Shape interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    // Implementation of the setColor method from Color interface
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
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Creating an instance of the class implementing both interfaces
        Circle circle = new Circle();

        // Calling methods from both interfaces
        circle.draw();
        circle.setColor("Red");

        // Calling an additional method specific to the Circle class
        circle.displayInfo();
    }
}
