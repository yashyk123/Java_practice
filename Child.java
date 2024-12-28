class Poly {
    void display() {
        System.out.println("parent display....");
    }
}
class Child extends Poly {
    void display() 
    {
        System.out.println("child display....");
    }

    public static void main(String[] args) {
        Poly obj = new Child();
        obj.display();
    }
}

// class Bike{  
//     void run(){System.out.println("running");}  
//   }  
//   class Splendor extends Bike{  
//     void run(){System.out.println("running safely with 60km");}  
    
//     public static void main(String args[]){  
//       Bike b = new Splendor();//upcasting  
//       b.run();  
//     }  
//   }  