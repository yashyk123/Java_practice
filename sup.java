class Vehicle {

    int speed = 122;

    void model()
    {
        System.out.println("Top Model");
    }

    Vehicle()
    {
        System.out.println("Vehicle Constructor");
    }
    
}

class Car extends Vehicle {
   int speed= 160;
   void display()
   {
    System.out.println("Car speed "+ speed);
    System.out.println("Vehicle speed "+super.speed);
   }

   void model()
    {
        super.model();
    }

    Car()
    {
        super();
        System.out.println("Car constructor");
    }
}

public class sup {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.model();
        
    }
}
