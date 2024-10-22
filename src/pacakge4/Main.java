package pacakge4;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String path = "C:/Users/Ирек/IdeaProjects/untitled2/src/pacakge4/file.txt";
        File file = new File(path);

        int b,count = 0;

        InputStream inputStream = null;

        try {

            inputStream = new FileInputStream(file);

            while ((b = inputStream.read()) != -1){
                System.out.println((char) b);
                count++;
            }
            System.out.println("\n число байт" + count);
        } catch (Exception e) {
           System.err.println("Ошибка чтения из файла " + e);
        }
        finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка закрытии файла");
            }
        }

    }
}
