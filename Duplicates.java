import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        FindDuplicates fd = new FindDuplicates();
        fd.find_dupli();
    }
}

class FindDuplicates{
    public void find_dupli()
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,3,8,7,3,2,3,1));
        HashSet<Integer> dupli = new HashSet<>();
        // for(int i=0; i<arr.size(); i++)
        // {
        //     for(int j=i+1; j<arr.size(); j++)
        //     {
        //         if(arr.get(i)==arr.get(j))
        //         {
        //             dupli.add(arr.get(i));
        //         }
        //     }
        //     // System.out.println(arr.get(i));
        // }
        // System.out.println(dupli);

        for(int a : arr)
        {
            if(dupli.contains(a))
            {
                System.out.println(a);
            }
            dupli.add(a);
        }
        System.out.println(dupli);
    }
}
