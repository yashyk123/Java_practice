import java.util.Scanner;

public class CheckNumber {
	
	
	void NumberCheck(int a)
	{
		if(a>0)
		{
			System.out.println("Negative Number");
		}
		else if(a<0)
		{
			System.out.println("Positive Number");
		}
		else {
			System.out.println("zero Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);
	     System.out.println("Enter Number");
	     int a = scan.nextInt();
		 CheckNumber obj = new CheckNumber();
		obj.NumberCheck(a);

	}

}
