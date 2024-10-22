package pacakge4;

import java.io.InvalidObjectException;

public class SerializationApp {

    public static void main(String[] args) throws InvalidObjectException {

        Student student = new Student("Самат",1,"123");

        System.out.printf(String.valueOf(student));

        String path = "C:/Users/Ирек/IdeaProjects/untitled2/src/pacakge4/file.txt";
Serializator serializator = new Serializator();
boolean b = serializator.serialization(student,path);

Student result = null;

try {
    result = serializator.deserialization(path);

} catch (InvalidObjectException e) {
    throw new RuntimeException(e);
}

        System.out.println(result);
    }
}
