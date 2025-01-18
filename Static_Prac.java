public class Static_Prac {
    int rollNo;
    static String name = "Yash";

    static class In {
        void show()
        {
            System.out.println("Static block is called");
        }
       
    }

    static void display(int a)
    {
        System.out.println("rollNo :"+ a + " Name :"+name);
    }
    public static void main(String[] args) {
        // Static_Prac st = new Static_Prac();
        //st.rollNo = 10;
        // display(18);

        In a = new In();
        a.show();
    }
}
