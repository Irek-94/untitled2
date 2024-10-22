package pacakge3;

import java.util.ArrayList;
import java.util.Arrays;

public class Planet {

    private ArrayList<Continent> continents;
    private ArrayList<Ocean> oceans;
    private ArrayList<Island> islands;

    public ArrayList<Continent> getContinents() {
        return continents;
    }

    public void setContinents(ArrayList<Continent> continents) {
        this.continents = continents;
    }

    public ArrayList<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(ArrayList<Ocean> oceans) {
        this.oceans = oceans;
    }

    public ArrayList<Island> getIslands() {
        return islands;
    }

    public void setIslands(ArrayList<Island> islands) {
        this.islands = islands;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "continents=" + continents +
                ", oceans=" + oceans +
                ", islands=" + islands +
                '}';
    }
}
