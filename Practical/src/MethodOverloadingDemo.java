// 4.	Write a program to demonstrate method overloading condition.

public class MethodOverloadingDemo {

    // Method with two integer parameters
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with a string parameter
    public static String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Testing the overloaded methods
        int result1 = add(5, 10);
        int result2 = add(5, 10, 15);
        double result3 = add(2.5, 3.5);
        String result4 = concatenate("Hello", " World");

        // Displaying the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
