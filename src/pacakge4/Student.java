package pacakge4;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private int id;
    private transient String password;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
