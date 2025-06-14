import java.util.Arrays;

public class SmallestEle {
    public int FindSmallEle(int arr[])
    {
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public int BySorting(int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int arr[] = { 12,54,20,70,64,31,10};
        SmallestEle obj = new SmallestEle();
        System.out.println("Smallest element is :" + obj.FindSmallEle(arr));

       
        System.out.println("Smallest element is :" + obj.BySorting(arr));
    }
}