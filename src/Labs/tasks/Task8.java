package Labs.tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(qcd(scan.nextInt(), scan.nextInt()));

    }

    public static int qcd(int x, int y) {
        while (y != 0 && x != 0) {
            if (y > x) {
                y = y % x;
            } else x = x % y;
        }
        return Math.max(x, y);

    }
}
