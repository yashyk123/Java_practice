import java.util.Scanner;

public class day_12 {

    static void isAdult(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("age less than 18");
        }
        else
        {
            System.out.println("you are 18+");
        }
    }
    public static void main(String[] args) {
        isAdult(14);
        System.out.println("after static method");

        // try {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("Enter two number");
        //     int a=sc.nextInt();
        //     int b=sc.nextInt();
        //     int result=a/b;
        //     System.out.println("Result "+ result);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
        // System.out.println("after try-catch");


        // try {
        //     int arr[] = {2,5,7};
        //     System.out.println(arr[2]);
        //    // arr[3]=2;
        //    arr[2] =2/0;
            
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("can't divided by zero "+ e.getMessage());
        // } 
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println(e.getMessage());
        // } 
        // catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
        // finally
        // {
        //     System.out.println("finally block");
        // }
        // System.out.println("after try-catch");

        // try {
        //     //int a = 2/0;
        //     String s = null;
        //     System.out.println(s.length());
        //     // System.out.println(a);
        // } catch (NullPointerException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }
        // finally{
        //     System.out.println("finally block");
        // }
        // System.out.println("after try-catch");


        // int balance = 500;
        // int withdraw = 3000;
        // try{
        // if (balance > withdraw)
        // {
        // balance = balance - withdraw;
        // System.out.println("transaction sucssesfully");
        // }
        // else
        // {
        //     throw new ArithmeticException("insufficient balance");
        // }
        // }
        // catch(ArithmeticException e)
        // {
        // System.out.println(e);
        // }
        // System.out.println("rest of code");


    }
}
