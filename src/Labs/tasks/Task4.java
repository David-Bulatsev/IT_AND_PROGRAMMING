package Labs.tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num1 = scan.nextByte();
        byte num2 = scan.nextByte();
        byte num3 = scan.nextByte();
        System.out.println(triangType(num1, num2, num3));
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
}
