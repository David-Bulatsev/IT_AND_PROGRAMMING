package Labs.tasks.task1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(tables(scan.nextInt(), scan.nextInt()));

    }

    public static int tables(int x, int y) {
        while (y > 0) {
            y -=1;
            x -= 2;
        }
        if (x < 0) return 0;
        if (x % 2 != 0) return (x+1) / 2;
        else return x / 2;
    }

}
