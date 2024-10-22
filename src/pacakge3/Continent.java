package pacakge3;

import java.util.Objects;

public class Continent {

    private String name;
    private double square;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        if (square < 0){
            throw new NegativeSquareException("Negative value specified");
        }
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Double.compare(continent.square, square) == 0 && Objects.equals(name, continent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
