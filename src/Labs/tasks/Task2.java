package Labs.tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(fitCalc(num1, num2));
    }
    public static int fitCalc(int a, int b){
        return a * b;
    }
}
