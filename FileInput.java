import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream obj = new FileInputStream("TestProgram.java");

            System.out.println("File contents : ");
            int x;
            while ((x = obj.read()) != -1) {
                System.out.print((char) x);
            }

            obj.close();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}

/*
 * When we use .read() in streams, it will read one character at a time
 * once the file is over, it will just return -1
 * 
 */