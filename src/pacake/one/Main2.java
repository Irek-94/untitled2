package pacake.one;

import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    static void go(int x) {
        System.out.println("int");
    }

    static void go(long x) {
        System.out.println("long");
    }

    public static void go(Object o) {
        Byte b2 = (Byte) o;
        System.out.println(b2);
    }

    public static int counter = 0;


    public static void main(String[] args) throws IOException {

        int [] array = {9,2,6,3,7};

       linearSearch(array,3);
    }

    public static int linearSearch(int[] array,int elementSearch){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementSearch){
                return  i;
            }
        }
        return elementSearch;
    }

    public static double getRandomValue(int i) {
        return Math.random() * i;
    }

    public static int sum(int a, int b) {
        return (a * b) * b;
    }

    public static int square(int i) {
        return i * i;
    }

    private static void print(String fullName, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Student %s receive %s by %s", fullName, mark, subject);
        System.out.println(formatter);
    }

    private static StringBuilder createSomeString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n").
                append(" * ").append(b).append(" = ").append(a * b).append("\n")
                .append(" / ").append(b).append(" = ").append(a / b).append("\n");
        return result;
    }

    private static StringBuilder modifySomeString(StringBuilder stringBuilder) {
        int pos = stringBuilder.indexOf("=");
        stringBuilder.deleteCharAt(pos);
        stringBuilder.insert(pos, "equal");
        return stringBuilder;
    }

    public static void print(Season season) {

        switch (season) {
            case Winter -> System.out.println("I like winter");
            case Spring -> System.out.println("Spring most warw");
        }

    }

    public static int factorial(int x) {
        int result;

        if (x < 2) {
            return 1;
        }

        result = factorial(x - 1) * x;
        return result;
    }

    public static void test(int a) {
        System.out.println("a: " + a);
    }

    public static double test(int... array) {

        return 0;
    }


    private static void compareNumber(int number) {

        if (number > 0 && number < 10) {
            System.out.println("Positive number less 10");
        } else {
            System.out.println("Positive number more 10 or negative");
        }
    }


}
