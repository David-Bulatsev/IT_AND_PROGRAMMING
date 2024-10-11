package Labs.lab3;

import java.util.LinkedList;

public class HashTable<K, V> {

    private final LinkedList<Entry<K, V>>[] table;
    private final int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(K key){
        int index = hash(key);
        if (table[index] != null){
            for (Entry<K, V> entry : table[index]){
                if (entry.getKey().equals(key)){
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }

    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
