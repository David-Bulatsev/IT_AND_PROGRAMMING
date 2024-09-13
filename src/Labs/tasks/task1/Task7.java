package Labs.tasks.task1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(scan.nextShort()));

    }

    public static int factorial(short n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;

        }
        return res;
    }
}
