package src.inOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadNewFile {
    public static void main(String[] args) throws FileNotFoundException {


//        FileReader fileReader = new FileReader("D:\\fynjy\\new_file.txt");
        try(BufferedReader br = new BufferedReader (new FileReader("D:\\\\fynjy\\\\new_file.txt"))) {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1) {
                System.out.print((char)c);
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


