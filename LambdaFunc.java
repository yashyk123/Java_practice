import java.util.ArrayList;
import java.util.LinkedList;

interface hello {
void display(int a);
// void display();
    
}

// class test implements hello
// {

//     @Override
//     public void display() {
//         // TODO Auto-generated method stub
//         System.out.println("Hello case 1");
//     }

// }
public class LambdaFunc {
    public static void main(String[] args) {
        // test t = new test();
        // t.display();



        // hello h = new hello() {
        //     @Override
        //     public void display(int a) {
        //         System.out.println("Hello case 2 " + a*a);
        //     }
        // };
        // h.display(5);

        // hello h = (a)->{
        //     System.out.println("Hello case 3 "+ a*a);
        // };
        // h.display(5);

        LinkedList<Integer> arr = new LinkedList<>();
        arr.add(54);
        arr.add(2);
        arr.add(73);
        arr.add(4);

        arr.forEach(a->System.out.println(a));
        System.out.println(arr);
        
    }
}
