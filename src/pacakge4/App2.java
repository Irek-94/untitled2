package pacakge4;

import java.io.*;

public class App2 {


    public static void main(String[] args) {

        String path = "C:/Users/Ирек/IdeaProjects/untitled2/src/pacakge4/file.txt";
        File file = new File(path);

        int b, count = 0;

        Reader reader = null;

        try {

            reader = new FileReader(file);

            while ((b = reader.read()) != -1) {
                System.out.println((char) b);
                count++;
            }
            System.out.println("\n число байт" + count);
        } catch (Exception e) {
            System.err.println("Ошибка чтения из файла " + e);
        }
    }
}
