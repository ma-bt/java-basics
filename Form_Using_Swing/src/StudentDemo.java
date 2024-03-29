public class StudentDemo{

    public static void main(String[] args) {

        DOB dob = new DOB(24,9,2021);

        Student s0 = new Student(1,"Anusha ",35,"Pokhara",dob);

        s0.showInfo();

        System.out.println();

        Student s1 = new Student(2, "Helya", 40, "kathmandu", new DOB(20,10,2019) );

        s1.showInfo();

    }

}

class Student {

    int roll;

    String name;

    int age;

    String address;

    DOB dob;

    public Student(int roll ,String name , int age, String address , DOB dob )

    {

        this.roll = roll;

        this.name = name;

        this.age = age;

        this.address = address;

        this.dob = dob;

    }

    //default constructor

    public Student()

    {



    }

    public void showInfo()

    {

        System.out.println("Name :" + name);

        System.out.println("Age :" + age);

        System.out.println("Address :" + address);

        System.out.println("Roll no :" + roll);

        System.out.println("Date of Birth :" + dob.getDate());



    }

}

class DOB

{

    int dd,mm,yy;

    public DOB(int dd, int mm, int yy) {

        this.dd = dd;

        this.mm = mm;

        this.yy = yy;

    }

    public String getDate()

    {

        return(dd + "/" + mm + "/" + yy);

    }

} 