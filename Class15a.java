import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Class15a {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        while (n !=0) {
            arr.add(n);
            n = sc.nextInt();
        }
        System.out.println("----------------------");

        // for(int a : arr)
        // {
        //     System.out.print(a + " ");
        // }
        System.out.println(arr);
        System.out.println(arr.peek());
        System.out.println(arr);
        System.out.println(arr.poll());
        System.out.println(arr);
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
    }
}
}
