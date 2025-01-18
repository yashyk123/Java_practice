public class RevesreBySubstring {
    public static void main(String[] args) {
        String str = "HelloyWorld";
        String output = "";
        String subString="";
        System.out.println("original String: "+ str);

        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)!='y')
            {
                subString+=str.charAt(i);
            }
            else{
                output += new StringBuilder(subString).reverse().toString();
                subString = "";
            }
        }
        output += subString;
        System.out.println("Reverse String split by y: "+ output);
    }
}
