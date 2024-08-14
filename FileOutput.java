import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        // for input:
        // Scanner class
        // for output:
        // Sout
        try {
            FileOutputStream obj = new FileOutputStream("TestProgram.java");
            // Scanner sc = new Scanner(System.in);
            // for (int i = 0; i < 3; i++) {
            // System.out.println("Enter your name: ");
            // String name = sc.nextLine();
            // System.out.println("Enter your age: ");
            // int age = sc.nextInt();
            // sc.nextLine();
            // // we store character by character
            // // which means we store in bytes
            // // what we can do is convery our data to a byte array
            // // and write to the file at once
            // // for(int j = 0; j < name.length(); j ++) {
            // // obj.write(name.charAt(j));
            // // }
            // obj.write(name.getBytes());
            // obj.write("\n".getBytes());
            // obj.write(Integer.toString(age).getBytes());
            // obj.write('\n');

            // }
            // sc.close();

            String newJavaProgram = "class TestProgram{\npublic static void main(String args[]){\nSystem.out.println(\"Random Program\");}}";
            obj.write(newJavaProgram.getBytes());

            obj.close();
        } catch (IOException e) {
            System.out.println("Exception occured: " + e);
        }
    }
}
