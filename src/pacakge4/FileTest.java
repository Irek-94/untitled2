package pacakge4;

import java.io.File;

public class FileTest {

    public static void main(String[] args) {

        String path = "C:/Users/Ирек/IdeaProjects/untitled2/src/pacakge4/file.txt";
        File file = new File(path);

        if (file.exists()){
            System.out.println(file.getName() + "Exist");
            if (file.isFile()){
                System.out.println("Path by file" + file.getPath());
                System.out.println("Absolute path by file" + file.getAbsolutePath());
            }
        }else{
            System.out.println(file.getName() + "Doesn't exist");
        }

    }
}
