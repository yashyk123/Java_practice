interface Bank {

    float Intrest();
}

class Icic implements Bank{

   public float Intrest()
   {
    return 8.5f;
   }
}

class Boi implements Bank {

    public float Intrest()
    {
        return 8.2f;
    }
}

class Kotak implements Bank{

   public float Intrest()
   {
    return 8f;
   }
}

public class Lec10 {
    public static void main(String[] args) {
        Bank roi;
        roi =  new Icic();
        System.out.println("Icic Bank Roi is " + roi.Intrest());

        roi = new Boi();
        System.out.println("Boi Bank Roi is " + roi.Intrest());
 
        roi = new Kotak();
        System.out.println("Kotak Bank Roi is " + roi.Intrest());
    }
}
