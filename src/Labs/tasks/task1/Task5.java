package Labs.tasks.task1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(ternaryEvaluation(num1, num2));
    }

    public static int ternaryEvaluation(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
}
