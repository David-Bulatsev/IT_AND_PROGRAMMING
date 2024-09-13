package Labs.tasks.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(convert(num));
    }

    public static double convert(int n) {
        return n * 3.785;
    }
}

