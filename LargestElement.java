import java.util.Arrays;

public class LargestElement {
    public int FindLargeEle(int arr[])
    {
        int large = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        return large;
    }

    public int BySorting(int arr[])
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,52};

        LargestElement lrgEle = new LargestElement();
        System.out.println("Largest element in array is: " + lrgEle.FindLargeEle(array));
        System.out.println("Largest element in array is: " + lrgEle.BySorting(array));
    }
}
