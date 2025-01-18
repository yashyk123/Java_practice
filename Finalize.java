public class Finalize {
    Finalize()
    {
        System.out.println("Finalize Constructor runnign....");
    }
    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        // super.finalize();
        System.out.println("Finalize method running.......");
    }

    public static void main(String[] args) {
        new Finalize();
        // Finalize finalize = new Finalize();
        // System.out.println("hashcode " + finalize.hashCode());
        // finalize = null;
        // Finalize finalize2 = new Finalize();
        // finalize = finalize2;

        System.gc();
        System.out.println("gc runnign");
    }
}