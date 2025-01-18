class hello extends Thread
{
	int total = 0;
	
	public void run()
	{
		synchronized (this){
            System.out.println("I am here..");
            for (int i = 1; i <= 500; i++) {
                total = total +10;
        }
            
		}
        
	}
}
public class Demo{

	public static void main(String[] args) throws InterruptedException{
	
		hello ob = new hello();
		ob.start();

        synchronized(ob)
        {
            System.out.println("runnig...");
            ob.wait();
            System.out.println(ob.total);
        }
		
		
	}}
