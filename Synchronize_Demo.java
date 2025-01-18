import java.util.Scanner;

public class Synchronize_Demo {
    public static void main(String[] args) throws Exception {
        a a1 = new a();

        new Thread()
        {
            public void run() {
                a1.b();
            };
        }.start();

        new Thread()
        {
            public void run() {
                a1.c();
            };
        }.start();
    }
}

 class a {
    
        int ram = 30 * 500;
        int shyam = 30*600;
        int ramDaySal;
        int ShyamDaySal;

        synchronized void b()
        {
            System.out.println("Ram monthly salary " + ram);
            System.out.println("Syam monthly salary " + shyam);

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            ramDaySal = ramDaySal*500;
            ShyamDaySal = ShyamDaySal*600;
            System.out.println("Ram day salary " + ramDaySal);
            System.out.println("Syam day salary " + ShyamDaySal);
        }

        synchronized void c()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ram working day");
             ramDaySal = sc.nextInt();
            System.out.println("Enter shyam working day");
             ShyamDaySal = sc.nextInt();
             notify();
        }
    }

