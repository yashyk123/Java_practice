import java.util.Stack;

public class ReverseStringByStack {
    public static void main(String[] args) {
       String str = "StrigHelloigolu";
       System.out.println("Original String: "+ str);

       String output = "";
       Stack<Character> stack = new Stack<>();
       int index=0;
       while(index<str.length())
       {
        if(str.charAt(index)!='i')
        {
            stack.push(str.charAt(index));
        }
        else
        {
            while(stack.empty())
            {
                output+=stack.pop();
            }
        }
        index++;
       }
       for(int i=0;i<stack.size();i++)
       {
        output+=stack.pop();
       }
       System.out.println("Reversed String: "+ output);
    }
}
