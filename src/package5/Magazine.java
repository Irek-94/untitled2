package package5;

import java.util.Objects;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable [] printables){
        System.out.println("Printing magazines: ");{
             for (Printable printable : printables) {
                 if (printable instanceof Magazine) {
                     Magazine magazine = (Magazine) printable;
                     System.out.println(printable);
                 }
             }
         }
    }

    @Override
    public void print() {
        System.out.println("Printing to magazine " + getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
