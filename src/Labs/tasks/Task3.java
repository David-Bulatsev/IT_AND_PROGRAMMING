package Labs.tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num1 = scan.nextByte();
        byte num2 = scan.nextByte();
        byte num3 = scan.nextByte();
        System.out.println(containers(num1, num2, num3));
    }

    public static int containers(byte num1, byte num2, byte num3) {
        return ((num1 * 20) + (num2 * 50) + (num3 * 100));
    }
}
