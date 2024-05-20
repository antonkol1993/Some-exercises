package src.inOutputStream;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFromConsole {
    public static void main(String[] args) throws IOException {

        int [] arr = {23,32,3,6,9,23,6,18,2323,240};
        for (int j : arr) {
            System.out.print(j + " ");
        }
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\fynjy\\file.txt"));
        FileWriter fileOut = null;


//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] % 3 == 0) {
//                    try{
//                    int c = arr[i];
//                    fileOut.write(c);
//
//
//                    } catch (IOException e) {
//                        e.getMessage();
//                    }
//                }
//
//            }
        fileOut = new FileWriter("D:\\fynjy\\file.txt");
        for (int i = 0; i < arr.length; i++) {

                try{

                    int c = 1;
                    fileOut.write(c);


                } catch (IOException e) {
                    e.getMessage();
                }


        }
        fileOut.close();


    }
}
