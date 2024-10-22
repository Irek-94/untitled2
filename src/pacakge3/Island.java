package pacakge3;

import java.util.Objects;

public class Island {

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
        this.square = square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Island island = (Island) o;
        return Double.compare(island.square, square) == 0 && Objects.equals(name, island.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square);
    }

    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                ", square=" + square +
                '}';
    }
}
