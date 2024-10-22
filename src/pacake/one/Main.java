package pacake.one;

import pacakge2.Cat;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(1000);
        arrayList.add(150);
        arrayList.add(-100);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(50);
        arrayList.add(47);
        System.out.println(arrayList);

        Comparator<Integer> descOrderComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Collections.sort(arrayList,descOrderComparator);

        System.out.println(arrayList);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1,90.0F,"Orange Juice"));
        items.add(new Item(2,20000.0F,"Bike"));
        items.add(new Item(3,40.0F,"Bread"));
        items.add(new Item(4,1050.0F,"Wine"));
        items.add(new Item(5,70.0F,"Milk"));

        System.out.println(items);

        Collections.sort(items,new Item.NameComparator());

        System.out.println(items);

        System.out.println((int) 'a');

        TreeMap treeMap = new TreeMap<>();
        treeMap.put("1","один");
        treeMap.put("2","два");
        treeMap.put("3","три");
        treeMap.put("4","четыре");

        System.out.println(treeMap);

    }
}
