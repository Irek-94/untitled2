package pacakge2;

import java.util.*;

public class Main {

    private static Boolean test;

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.bread = "Some bread";
        String s = animal.makeSound();
        System.out.println(s);
        System.out.println(animal.bread);
        System.out.println(animal.makeSound(" somesound"));

        Cat cat = new Cat();
        cat.bread = "Sia-mic cat";
        System.out.println(cat.makeSound());

      cat.makeSound("Muy",30);

    }

    public class Test implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread is in Running state");
        }
    }
}
