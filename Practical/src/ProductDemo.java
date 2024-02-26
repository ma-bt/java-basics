// 3.Create a class Product with name, qty and price. Create a parameterized constructor 
//to set the product details. Provide the method getName(), getQty() and getPrice() that 
//return product name, qty and price. Also create method getTotal() that returns the total 
//price. Then create a class ProductDemo with main method that creates two object of Product 
//and find the total price of both products.

// Class Product with name, qty, and price
class Product {
    // Data members
    private String name;
    private int qty;
    private double price;

    // Parameterized constructor to set product details
    public Product(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Method to get product name
    public String getName() {
        return name;
    }

    // Method to get product quantity
    public int getQty() {
        return qty;
    }

    // Method to get product price
    public double getPrice() {
        return price;
    }

    // Method to calculate and return total price
    public double getTotal() {
        return qty * price;
    }
}

// Class ProductDemo with main method
public class ProductDemo {
    public static void main(String[] args) {
        // Creating two instances of Product
        Product product1 = new Product("Laptop", 2, 1200.50);
        Product product2 = new Product("Smartphone", 5, 599.99);

        // Displaying product details and total price for each product
        displayProductDetails(product1);
        displayProductDetails(product2);
    }

    // Helper method to display product details and total price
    private static void displayProductDetails(Product product) {
        System.out.println("Product Name: " + product.getName());
        System.out.println("Quantity: " + product.getQty());
        System.out.println("Price per unit: $" + product.getPrice());
        System.out.println("Total Price: $" + product.getTotal());
        System.out.println();  // Adding a line break for better readability
    }
}
