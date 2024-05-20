package src.inOutputStream;

import java.io.*;

public class CreateDate {

    public static void main(String args[]) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("D:\\fynjy\\file.txt");
            fileOut = new FileWriter("D:\\fynjy\\new_file.txt");

            int c = 1 ;
            fileOut.write("c");
//            fileOut.write("18/05/2024");
//            fileOut.append(" saasd");

        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }

        }
    }
}
