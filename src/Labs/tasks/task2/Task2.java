package Labs.tasks.task2;

import java.nio.charset.Charset;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 8, 1, 2, 4};
//        System.out.println(divideByThree(arr));
//        System.out.println(getInitials("kozhevnikova tatiana vitalevna"));
//        System.out.println(compressedNums(arr));
//        System.out.println(secondBiggest(arr));
//        System.out.println(equal(0, 2, 2));
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
    }


    //    1
    public static String duplicateChars(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        for (char i : s1.toCharArray()) {
            if (!s2.contains(String.valueOf(i))) {
                System.out.println(i);
                result.append(i);
            }
        }
        return result.toString();
    }

    //    2
    public static int divideByThree(int[] args) {
        int counter = 0;
        for (int i : args) {
            if (i % 2 != 0 && i % 3 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //    3
    public static String getInitials(String str) {
        String[] s = str.split(" ");
        char f = s[1].toUpperCase().charAt(0);
        char i = s[2].toUpperCase().charAt(0);
        String o = s[0].substring(0, 1).toUpperCase() + s[0].substring(1);
        return f + "." + i + "." + o;
    }

    //    4
    public static double[] normalizator(double[] numbers) {
        double min = numbers[0];
        double max = numbers[0];

        for (double i : numbers) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if ((max - min) != 0) {
                result[i] = (numbers[i] - min) / (max - min);
            } else result[i] = 0;
        }
        return result;
    }

    //    5
    public static ArrayList<Integer> compressedNums(double[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (double i : numbers) {
            if (i != 0) {
                result.add((int) i);
            }
        }
        Collections.sort(result);
        return result;

    }

    //    6
    public static String camelToSnake(String s) {
        int A = (int) 'A';
        int Z = (int) 'Z';
        StringBuilder result = new StringBuilder();
        for (char i : s.toCharArray()) {

            if ((int) i >= A && (int) i <= Z) {
                result.insert(s.indexOf(i), "_" + ((char) ((int) i + 32)));
            } else result.append(i);
        }
        return result.toString();
    }

    //    7
    public static int secondBiggest(int[] arr) {
        int max1 = arr[0];
        int max2 = arr[0];
        for (int i : arr) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            }
        }
        return max2;
    }

    //    9
    public static int equal(int i1, int i2, int i3) {
        int cnt = 0;
        if (i1 == i2) {
            if (i1 == i3)
                return 3;
            return 2;
        }
        if (i1 == i3) {
            return 2;
        }
        if (i2 == i3) {
            return 2;
        }

        return cnt;
    }

    //    10
    public static boolean isAnagram(String s1, String s2) {
        char[] ch1 = s1.toLowerCase().replaceAll(" ", "").toCharArray();
        char[] ch2 = s2.toLowerCase().replaceAll(" ", "").toCharArray();
        if (s1.length() != s2.length())
            return false;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
