package pacakge3;

import java.util.Objects;

public class Ocean {

    private String name;
    private double square;
    private double salty;

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

    public double getSalty() {
        return salty;
    }

    public void setSalty(double salty) {
        this.salty = salty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ocean ocean = (Ocean) o;
        return Double.compare(ocean.square, square) == 0 && Double.compare(ocean.salty, salty) == 0 && Objects.equals(name, ocean.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, salty);
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", salty=" + salty +
                '}';
    }
}
