import java.util.Scanner;

public class LeapYear {
	
	boolean isLeapYear(int a)
	{
		if(a%400==0 || a%4==0 && a%100 !=0)
		{
			return true;
		}
        else{
            return false;
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int a = sc.nextInt();
        LeapYear obj = new LeapYear();
      System.out.println( obj.isLeapYear(a));
	}

}
