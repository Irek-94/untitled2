package pacakge3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

Continent eurasia = new Continent();
eurasia.setName("Eurasia");
eurasia.setSquare(54_760_000);

Continent africa = new Continent();
africa.setName("Africa");
africa.setSquare(30_370_000);

        ArrayList<Continent> continents = new ArrayList<>();
        continents.add(eurasia);
        continents.add(africa);


Ocean indian = new Ocean();
indian.setName("Indian");
indian.setSalty(40.4);
indian.setSquare(70_560_000);

Ocean atlantic = new Ocean();
atlantic.setSalty(30.0);
atlantic.setSquare(90_000_000);
atlantic.setName("Atlantic");

ArrayList<Ocean> oceans = new ArrayList<>();
oceans.add(indian);
oceans.add(atlantic);

Island madagaskar = new Island();
madagaskar.setName("Madagaskar");
madagaskar.setSquare(100_000);

ArrayList<Island> islands = new ArrayList<>();
islands.add(madagaskar);

Planet planet = new Planet();
planet.setContinents(continents);
planet.setOceans(oceans);
planet.setIslands(islands);

        System.out.println(planet);


    }

    private static int parsIntFromString(String number){
        return Integer.parseInt(number);
    }
}
