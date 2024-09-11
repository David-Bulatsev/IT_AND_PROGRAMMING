package Labs.tasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(ticketSaler(scan.nextInt(), scan.nextInt()));

    }

    public static int ticketSaler(int x, int y) {
        float num1 = x * y;
        float sale = num1 * 0.28f;
        return (int) (num1 - sale);
    }
}
