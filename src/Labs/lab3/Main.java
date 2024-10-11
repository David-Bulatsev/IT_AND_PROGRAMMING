package Labs.lab3;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> ht = new HashTable<>(10);
        System.out.println(ht.isEmpty());

        ht.put("david", 1);
        ht.put("anton", 2);
        ht.put("lol", 5325);


        System.out.println("Размер таблицы: " + ht.size());
        System.out.println("Значение для ключа 'lol': " + ht.get("lol"));
        ht.remove("lol");
        System.out.println("Значение для ключа 'lol': " + ht.get("lol"));

        System.out.println("Ключ 'anton' существует: " + ht.containsKey("anton"));
        System.out.println(ht.isEmpty());
    }
}
