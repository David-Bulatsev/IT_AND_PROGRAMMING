package Labs.tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float w = scan.nextFloat();
        float h = scan.nextFloat();
        System.out.println(howManyItems(n, w, h));
  }
    public static int howManyItems(int n, float w, float h){
        float size = w * h;
        int c = (n /2);
        return (int) (c / size);
    }
}
