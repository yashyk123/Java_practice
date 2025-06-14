// find the number which is present in first array but not in second array;

import java.util.Arrays;

class mj_interviewQue {
    public static void main(String[] args) {
       int arr[] = {1,4,20,10,33};
       int a[] = {11,2,1,4};
       
       //10,20,33
       
       Arrays.sort(arr);
       Arrays.sort(a);
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(a));
       
       for(int i=0; i<arr.length;i++)
       {
           boolean found = false;
           for(int j=0; j<a.length; j++)
           {
               if(arr[i]==a[j])
               {
                   //System.out.print(arr[i]+ " ");
                   found = true;
                   break;
               }
           }
           if(!found)
           {
               System.out.print(arr[i]+ " ");
           }
       }
    }
}