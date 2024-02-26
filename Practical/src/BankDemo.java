//11.Create a class BankAccount that have data member accNo, Name, address, phone, gender, constructor
//        to set the bank details and showDetails() method to display the account details. 
//        Create subclass SavingAccount which inherits BankAccount and have data member currentAmount 
//        and month, constructor to set the data member, methods calcTotal() that update the currentAmount
//        by adding the bonus amount and return the result. (if saving month is below 3 mnth bonus is 2%, 
//        if saving month is between 3 to 6 month bonus is 5%, if saving month is between 6 to 12 month 
//        bonus is 8% and if saving month is above 1 year bonus is 11.03%).  Now create the object of 
//        SavingAccount and demonstrate the scenario.


// Superclass
class BankAccount {
    // Data members
    protected int accNo;
    protected String name;
    protected String address;
    protected String phone;
    protected String gender;

    // Constructor to set bank details
    public BankAccount(int accNo, String name, String address, String phone, String gender) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    // Method to display account details
    public void showDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Gender: " + gender);
    }
}

// Subclass
class SavingAccount extends BankAccount {
    // Data members specific to SavingAccount
    private double currentAmount;
    private int months;

    // Constructor to set SavingAccount details
    public SavingAccount(int accNo, String name, String address, String phone, String gender,
                         double currentAmount, int months) {
        super(accNo, name, address, phone, gender);
        this.currentAmount = currentAmount;
        this.months = months;
    }

    // Method to calculate and update currentAmount with bonus
    public double calcTotal() {
        double bonusRate;

        if (months < 3) {
            bonusRate = 0.02;
        } else if (months <= 6) {
            bonusRate = 0.05;
        } else if (months <= 12) {
            bonusRate = 0.08;
        } else {
            bonusRate = 0.1103;
        }

        double bonusAmount = currentAmount * bonusRate;
        currentAmount += bonusAmount;

        return currentAmount;
    }

    // Method to display SavingAccount details
    public void showSavingDetails() {
        // Displaying general account details from the superclass
        super.showDetails();
        System.out.println("Current Amount: $" + currentAmount);
        System.out.println("Saving Months: " + months);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        // Creating an instance of SavingAccount
        SavingAccount savingsAccount = new SavingAccount(123456, "tibra shrestha", "123 Main St", "980813468", "male", 1999.0, 10);

        // Displaying SavingAccount details before bonus calculation
        System.out.println("Before Bonus Calculation:");
        savingsAccount.showSavingDetails();

        // Calculating and displaying total amount after bonus
        double totalAmount = savingsAccount.calcTotal();
        System.out.println("\nAfter Bonus Calculation:");
        System.out.println("Total Amount after Bonus: rs" + totalAmount);
                System.out.println("Nasla Maharjan 23486");

//                System.out.println("Tibra Shrestha 23512");

    }
}
