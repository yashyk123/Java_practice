 interface InnerLec10_1 {
   default void show(){
    System.out.println("show Block...");
    display();
   }

   static void hello()
   {
    System.out.println("Hello Block...");
   }

   private void display()
   {
    System.out.println("display Block...");
   }
    
}

public class Lec10_1 implements InnerLec10_1{
    public static void main(String[] args) {
       
        InnerLec10_1.hello();

        Lec10_1 obj = new Lec10_1();
        obj.show();
    }
}
