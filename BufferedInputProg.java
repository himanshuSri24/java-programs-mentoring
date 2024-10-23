import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputProg {
    public static void main(String[] args) {
        try {
            FileInputStream fileObj = new FileInputStream("TestProgram.java");
            BufferedInputStream obj = new BufferedInputStream(fileObj);

            System.out.println("File contents : ");
            int x;
            while ((x = obj.read()) != -1) {
                System.out.print((char) x);
            }

            obj.close();
            fileObj.close();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}