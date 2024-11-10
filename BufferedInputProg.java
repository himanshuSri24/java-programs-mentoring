import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class BufferedInputProg {
    public static void main(String[] args) {
        try {
            FileReader fileObj = new FileReader("TestFile.txt");
            BufferedReader obj = new BufferedReader(fileObj);

            System.out.println("File contents : ");
            String x;
            while ((x = obj.readLine()) != null) {
                String arr[] = x.split(" ");
                System.out.println(Arrays.toString(arr));
                // System.out.println(x);
            }

            obj.close();
            fileObj.close();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}