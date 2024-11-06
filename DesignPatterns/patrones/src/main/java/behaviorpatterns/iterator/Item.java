package behaviorpatterns.iterator;

public class Item {
    private String name;
    private int price;
    private Item next;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Item setPrice(int price) {
        this.price = price;
        return this;
    }

    public Item getNext() {
        return next;
    }

    public Item setNext(Item next) {
        this.next = next;
        return this;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                "price=" + price;
    }
}
