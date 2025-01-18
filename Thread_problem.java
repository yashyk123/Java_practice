class practice extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            try {
                Thread.sleep(500);
                System.out.println(getName() +" "+getPriority());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         System.out.println("Hi "+ getName() + getPriority());
        }
    }
}

class Hello extends Thread{
    public void run() {
       for(int i=0; i<5; i++)
       {
        try {
            Thread.sleep(500);
            System.out.println("hello " + getName() +" "+getPriority());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       }
    }
}

class Thread_problem {
    public static void main(String[] args) throws Throwable {
        
        practice t = new practice();
        t.start();
       // t.join();
        Hello h1 = new Hello();
        
        h1.start();
        t.suspend();

        try {
			Thread.sleep(2000);
			t.resume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        
        // t.setPriority(10);
        // h1.setPriority(0);
        // t.setName("Thread-1");
        // h1.setName("Thread-2");
        
    }
}