package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        // File only points to the path and does not create the file itself
        File file = new File("D:\\code_workspace\\DSA-Java\\FileHandling\\aboutFile\\TestFile");

        FileInputStream fis = new FileInputStream(file);
        int data;
        while((data = fis.read()) != -1){
            System.out.print((char)data);
        }
        fis.close();

        // Simply FileOutputStream fos = new FileOutputStream(file);
        // overwrites the whole file
        FileOutputStream fos = new FileOutputStream(file,true);
        String str= "\nwas it successful ... cause i just learned it purely from api docs of oracle java - https://docs.oracle.com/javase/8/docs/api/ ";
        fos.write(str.getBytes());
        fos.close();

        /* way to take input from console
        while (true) {
            System.out.print("Enter text (type exit to stop): ");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            fos.write(input.getBytes());
            fos.write('\n');
        }
         */
    }
}
