import java.util.Arrays;

public class SecondSmallAndLargeEle {

    public int FindSecLarge(int a[])
    {
        Arrays.sort(a);
        int secLarge = a[a.length - 2];
        return secLarge;
    }

    public int FindSecSmall(int a[])
    {
        Arrays.sort(a);
        int secSmall = a[1];
        return secSmall;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,7,7,5};
        SecondSmallAndLargeEle obj = new SecondSmallAndLargeEle();
        System.out.println("Second largest element is: "+obj.FindSecLarge(arr));
        System.out.println("Second smallest element is: "+obj.FindSecSmall(arr));

    }
}