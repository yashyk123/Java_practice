import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,8,7,2,12};
        int target = 8;
        Arrays.sort(arr);
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}