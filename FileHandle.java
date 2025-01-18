import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandle {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\Yash\\Desktop\\fullstack\\HTML\\java\\ppt\\NewFile.txt");

        // FileWriter fw = new FileWriter("C:\\Users\\Yash\\Desktop\\fullstack\\HTML\\java\\ppt\\NewFile.txt");

        // BufferedWriter bf = new BufferedWriter(fw);
        // bf.write("Hello, yash!");
        // bf.close();

        // FileOutputStream fo = new FileOutputStream("C:\\Users\\Yash\\Desktop\\fullstack\\HTML\\java\\ppt\\NewFile.txt");

        // fo.write(45);
        // fo.close();

        BufferedReader br = new BufferedReader(new FileReader(f));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }
}
