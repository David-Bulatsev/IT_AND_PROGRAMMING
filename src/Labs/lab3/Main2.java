package Labs.lab3;
import Labs.lab3.HashTableInternetMag.Order;

public class Main2 {
    public static void main(String[] args) {
        HashTableInternetMag<Integer, Order> orderHashTable = new HashTableInternetMag<>(10);

// Создаем заказы
        Order order1 = new Order("Товар 1", "Адрес 1", 1000);
        Order order2 = new Order("Товар 3", "Адрес 2", 500);

// Вставляем заказы в хэш-таблицу
        orderHashTable.put(1, order1);
        orderHashTable.put(2, order2);

// Получаем заказ по номеру 1
        Order retrievedOrder = orderHashTable.get(1);
        System.out.println("Заказ №1: " + retrievedOrder.getAddress() + " - " + retrievedOrder.getPrice());

// Удаляем заказ №2
        orderHashTable.remove(2);
    }
}
