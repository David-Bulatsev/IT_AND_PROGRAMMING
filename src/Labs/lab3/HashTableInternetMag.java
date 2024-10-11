package Labs.lab3;

import java.util.LinkedList;

public class HashTableInternetMag<K, V> {

    private final LinkedList<Entry<Integer, Order>>[] table;
    private final int capacity;
    private int size;

    public HashTableInternetMag(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(Integer key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(Integer key, Order order) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<Integer, Order> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.value = order;
                return;
            }
        }
        table[index].add(new Entry<>(key, order));
        size++;
    }

    public Order get(Integer key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<Integer, Order> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(Integer key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<Integer, Order> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }

    }

    public boolean containsKey(Integer key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public static class Order {
        public String orderInfo;
        public String address;
        public int price;

        public Order(String orderInfo, String address, int price){
            this.orderInfo = orderInfo;
            this.address = address;
            this.price = price;

        }

        public String getAddress() {
            return address;
        }

        public int getPrice() {
            return price;
        }

        public String getOrderInfo() {
            return orderInfo;
        }
    }
}
