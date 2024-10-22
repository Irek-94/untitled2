package pacake.one;

import java.util.Comparator;

public class Item {

    private int itemId;
    private float price;
    private String name;

    public Item(int itemId, float price, String name) {
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class PriceComparator implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

    public static class IDComparator implements Comparator<Item> {

        @Override
        public int compare(Item o1, Item o2) {
            return (int) (o1.getItemId() - o2.getItemId());
        }
    }

    public static class NameComparator implements Comparator<Item> {


        @Override
        public int compare(Item o1, Item o2) {
            return (o2.getName().compareTo(o1.getName()));
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
