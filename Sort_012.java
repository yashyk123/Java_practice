import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class sort{
    int cnt0;
    int cnt1;
    int cnt2;
    
    public void sortNum()
    {
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,1,2,0,0,1,1));
        System.out.println(arr);

        for(int i=0; i<arr.size();i++)
        {
            if(arr.get(i)==0)
            {
               cnt0 +=1;
            }
            else if(arr.get(i)==1)
            {
                cnt1+=1;
            }
            else 
            {
               cnt2+=1;
            }
        }
        System.out.println(cnt0);
        System.out.println(cnt1);
        System.out.println(cnt2);

        arr.clear();
        System.out.println(arr);
        int n = cnt0+cnt1+cnt2;
        System.out.println(n);
        for(int i=0; i<cnt0;i++)
        {
            arr.add(0);
        }
        for(int i=0; i<cnt1;i++)
        {
            arr.add(1);
        }
        for(int i=0;i<cnt2;i++)
        {
            arr.add(2);
        }
        System.out.println(arr);

    }
}
public class Sort_012 {
    public static void main(String[] args) {
        sort s = new sort();
        s.sortNum();
    }
}
