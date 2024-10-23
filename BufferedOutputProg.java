import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputProg {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("TestFile.txt");
            BufferedOutputStream buffObj = new BufferedOutputStream(obj);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text you want to put in the file: ");
            // String newText = "This is a
            String newText = sc.nextLine();
            buffObj.write(newText.getBytes());
            buffObj.close();
            obj.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}
