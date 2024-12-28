public class matrix {

    public static void main(String[] args) {
        int mat[][] = { {10,20,30,40,50,60},{40,20,30,40,50,60}};
        int rowlen = mat.length;
        int  collen= mat[0].length;
        // System.out.println("Number of columns in the matrix is: "+collen);
        // System.out.println(rowlen);

        for(int i=0; i<rowlen; i++)
        {
            // System.out.print(i);
            // int rowlen = mat[i].length;
            for(int j=0; j<collen;j++)
            {
                // System.out.print(j);
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}