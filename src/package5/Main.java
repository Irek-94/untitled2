package package5;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {



    public static void main(String[] args) throws InterruptedException, ExecutionException {


String text = new String("text");
        System.out.println(text);


    }






    public static void change(int value) {
        value++;
    }

    private volatile int count = 0;

    void doCounter() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    count++;
                }
                System.out.println(count);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    count++;
                }
                System.out.println(count);
            }
        });

        t1.start();
        t2.start();


    }


    private static StringBuilder createSomeString(int a, int b) {

        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n").
                append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n").
                append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");

        return result;
    }

    private static void modifySomeString(StringBuilder stringBuilder) {

    }

    static void go(Long x) {
        System.out.println("Long");
    }

    public static void print(Season season) {
        switch (season) {
            case Winter -> System.out.println("Summer very hat");
            case Spring -> System.out.println("Spring everything around green");
            case Summer -> System.out.println("Weather very hat");
            case Autumn -> System.out.println("Fall everything yellow leaves");

        }
    }

    public static void printAllValues() {

        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getAvgTemp());
        }

    }

    public static int factorial(int n) {
        int result;

        if (n < 2) {
            return 1;
        }

        result = factorial(n - 1) * n;
        return result;
    }
}
