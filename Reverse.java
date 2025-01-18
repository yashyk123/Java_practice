public class Reverse {
    public static String reverse(String s)
    {
        char []arr = s.toCharArray();
        int left =0; 
        int right = arr.length-1;
    
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] =  temp;
            left++;
            right--;
        }
       return new String(arr);
    }
    public static void main(String[] args) {
        String s = "abcd12@3%";
    //    String reverse="";
    //    for (int i = s.length()-1; i >=0 ; i--) {
    //     reverse +=s.charAt(i);
    //    }
    //    System.out.println(reverse);

    
        String result = reverse(s);
       System.out.println(result);
       
       
        }

       
}
