public class Student {
    int rollNo;
    String name;
    int fees;

     Student(int rollNo, String name, int fees)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
        System.out.println(rollNo + " " + name + " " + fees);
        this.display();
    }

    void display()
    {
        System.out.println("display");
        
    }

public class A {
    A()
    {
        System.out.println("hello A");
    }
    A(int a)
    {
        this();
        System.out.println(a);
        
    }
    
}

    public static void main(String[] args) {
        Student st1 = new Student(69,"yash",69);
        //st1.display();
        Student.A obj = st1.new A(10);
    }
}