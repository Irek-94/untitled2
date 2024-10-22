package pacake.one;

public class Aspirant extends Student{

  String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark) {
        super(firstName, lastName, group, avgMark);
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                ", avgMark=" + avgMark +
                '}';
    }
}
