import java.util.ArrayList;
import java.util.Arrays;

public class Rotate {
    // public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
    //     // Write your code here.

    // }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,4,5,1));
        int k=3;
        ArrayList<Integer> store =new ArrayList<>(arr.subList(0, k));
        arr.subList(0, k).clear();
        // for(int i=k-1; i>=0; i--)
        // {
        //     store.add(arr.get(i));
        //     arr.remove(i);
            
        //     //System.out.println(arr.get(i));
        // }
        System.out.println(arr);
        System.out.println(store);
        arr.addAll(store);
        System.out.println(arr);
    }
}
