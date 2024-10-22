package pacakge4;

import java.io.*;

public class Serializator {

    public boolean serialization(Student student, String fileName) {
        boolean flag = false;
        File file = new File(fileName);
        ObjectOutputStream objectOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (fileOutputStream != null) {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(student);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }

    public Student deserialization(String filePath) throws InvalidObjectException {
        File file = new File(filePath);
        ObjectInputStream isStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            isStream = new ObjectInputStream(fileInputStream);

            Student student = (Student) isStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (isStream != null){
                try {
                    isStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        throw new InvalidObjectException("Object no reecreated");


    }
}
