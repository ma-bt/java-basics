//6.Provide an example of single inheritance of your choice. (Two child class inheriting single parent class)

// Base class
class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class 1
class Student extends Person {
    private int studentId;

    // Constructor
    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // Getter method
    public int getStudentId() {
        return studentId;
    }

    // Method to display student details
    public void displayStudentDetails() {
        displayDetails(); // Reusing the method from the base class
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class 2
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter method
    public String getSubject() {
        return subject;
    }

    // Method to display teacher details
    public void displayTeacherDetails() {
        displayDetails(); // Reusing the method from the base class
        System.out.println("Subject: " + subject);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating instances of derived classes
        Student student = new Student("Alice", 20, 1234);
        Teacher teacher = new Teacher("Mr. Smith", 35, "Mathematics");

        // Displaying details using methods from base and derived classes
        System.out.println("Student Details:");
        student.displayStudentDetails();
        System.out.println();

        System.out.println("Teacher Details:");
        teacher.displayTeacherDetails();
    }
}
