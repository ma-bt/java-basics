//2.Create a class Calculate which contains data member num1 and num2 both in integer and
//    methods setCalc() to set the data, calcSum() that calculate the sum of num1 and num2 and 
//    display the result, calcMulti() that calculate the multiplication of num1 and num2 and
//    returns the result, calcDifference that calculate the difference between num1 and num2 
//    and display the result. Now, create some instance of Calculate and invoke all the methods.




// Class Calculate with data members and methods
class Calculate {
    // Data members
    private int num1;
    private int num2;

    // Method to set data
    public void setCalc(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // Method to calculate and display the sum
    public void calcSum() {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    // Method to calculate and return the multiplication
    public int calcMulti() {
        return num1 * num2;
    }

    // Method to calculate and display the difference
    public void calcDifference() {
        int difference = num1 - num2;
        System.out.println("Difference: " + difference);
    }
}

// Main class to create instances of Calculate and invoke methods
public class CalculatorDemo {
    public static void main(String[] args) {
        // Creating an instance of Calculate
        Calculate calculator1 = new Calculate();
        Calculate calculator2 = new Calculate();

        // Setting data for the instances
        calculator1.setCalc(10, 5);
        calculator2.setCalc(8, 3);

        // Invoking methods for the first instance
        calculator1.calcSum();
        int multiplicationResult = calculator1.calcMulti();
        System.out.println("Multiplication: " + multiplicationResult);
        calculator1.calcDifference();

        // Invoking methods for the second instance
        calculator2.calcSum();
        multiplicationResult = calculator2.calcMulti();
        System.out.println("Multiplication: " + multiplicationResult);
        calculator2.calcDifference();
    }
}
