package src.inOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class WriteNewFile {
    public static void main(String[] args) throws FileNotFoundException {


        FileReader fileReader = new FileReader("D:\\fynjy\\new_file.txt");
        System.out.println(fileReader);

    }
}
