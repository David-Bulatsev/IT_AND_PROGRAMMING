package Labs.tasks.task1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1
        int num = scan.nextInt();
        System.out.println(convert(num));
//        2
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(fitCalc(num1, num2));
//        3
//        byte num1 = scan.nextByte();
//        byte num2 = scan.nextByte();
//        byte num3 = scan.nextByte();
//        System.out.println(containers(num1, num2, num3));
//        4
//        System.out.println(triangType(num1, num2, num3));
//        5
//        System.out.println(ternaryEvaluation(num1, num2));
//        6
        int n = scan.nextInt();
        float w = scan.nextFloat();
        float h = scan.nextFloat();
        System.out.println(howManyItems(n, w, h));
//        7
        System.out.println(factorial(scan.nextShort()));
//        8
        System.out.println(qcd(scan.nextInt(), scan.nextInt()));
//        9
        System.out.println(ticketSaler(scan.nextInt(), scan.nextInt()));
//        10
        System.out.println(tables(scan.nextInt(), scan.nextInt()));

    }


    public static double convert(int n) {
        return n * 3.785;
    }
    public static int fitCalc(int a, int b){
        return a * b;
    }
    public static int containers(byte num1, byte num2, byte num3) {
        return ((num1 * 20) + (num2 * 50) + (num3 * 100));
    }
    public static String triangType(int num1, int num2, int num3){
        if ((num1 + num2 < num3) || (num2 + num3 < num1) || (num1 + num3 < num2)) return "не является треугольником";
        if (num1 == num2){
            if (num1 == num3) return "равносторонний";
            return "равнобедренный";
        }
        if (num2 != num3) return "разносторонний";
        return "Недействительный ввод";
    }
    public static int ternaryEvaluation(int num1, int num2){
        return num1 > num2 ? num1 : num2;
    }
    public static int howManyItems(int n, float w, float h){
        float size = w * h;
        int c = (n /2);
        return (int) (c / size);
    }
    public static int factorial(short n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;

        }
        return res;
    }
    public static int qcd(int x, int y) {
        while (y != 0 && x != 0) {
            if (y > x) {
                y = y % x;
            } else x = x % y;
        }
        return Math.max(x, y);

    }
    public static int ticketSaler(int x, int y) {
        float num1 = x * y;
        float sale = num1 * 0.28f;
        return (int) (num1 - sale);
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