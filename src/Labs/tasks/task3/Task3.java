package Labs.tasks.task3;


import java.util.*;

public class Task3 {
    public static void main(String[] args) {
//        Object[][] arr = new Object[][] {{"Laptop", 124200}, {"Phone", 51450},
//                {"Headphones", 13800}};
//        Object[][] res = sale(arr, 25);
//        for (Object[] objects : res){
//            System.out.println( objects[0] +" " + objects[1]);
//        }
//        ArrayList<? extends Serializable> arr = new ArrayList<>(new ArrayList<>(Arrays.asList("Laptop", 124200)));
//        System.out.println(arr);

//        System.out.println(isStrangePair("ratio", "orator"));
//        System.out.println(sucsessShoot(0, 0, 5, 2, 2) );
//        System.out.println(sucsessShoot(-2, -3, 4, 5, -6) );
//        System.out.println(rps("scissors", "scissors") );
//        System.out.println(bugger(999));
//        Object[][] arr = new Object[][]{{"Скакалка", 550, 8}, {"Шлем", 3750, 4}, {"Мяч", 2900, 10}};
//        System.out.println(mostExpensive(arr));
//                {"Headphones", 13800}};
//        System.out.println(longestUnique("abcba"));


//        System.out.println(isPrefix("automation", "auto-"));
//        System.out.println(isSuffix("arachnophobia", "-phobia"));
//        System.out.println(isPrefix("retrospect", "sub-"));
//        System.out.println(isSuffix("vocation", "-logy"));
        System.out.println(doesBrickFit(3, 1, 2, 2, 1) );
    }

    //    1
    public static boolean isStrangePair(String str1, String str2) {
        return ((str1.charAt(0) == str2.charAt(str2.length() - 1))
                && (str1.charAt(str1.length() - 1) == str2.charAt(0)));
    }

    //    2
    public static Object[][] sale(Object[][] arr, int saleName) {
        for (Object[] objects : arr) {
            objects[1] = (int) objects[1] - ((int) objects[1] / 100 * saleName);
        }
        return arr;
    }

    //    3
    public static boolean sucsessShoot(int x, int y, int r, int m, int n) {
        int deltaX = m - x;
        int deltaY = n - y;
        return ((deltaX * deltaX + deltaY * deltaY) < r * r);
    }

    //    4
    public static boolean parityAnalysis(int n) {
        int sumOfDigits = 0;
        int num = n;
        while (num != 0) {
            sumOfDigits += (num % 10);
            num /= 10;
        }
        return sumOfDigits % 2 == n % 2;
    }

    //    5
    public static String rps(String player1, String player2) {
        String win1 = "Player 1 wins";
        String win2 = "Player 2 wins";
        String tie = "Tie";

        if (player1 == "rock") {
            if (player2 == "scissors") return win1;
            if (player2 == "paper") return win2;
        }
        if (player2 == "rock") {
            if (player1 == "scissors") return win2;
            if (player1 == "paper") return win1;
        }
        if (player1 == "scissors") {
            if (player2 == "rock") return win2;
            if (player2 == "paper") return win1;
        }
        if (player2 == "scissors") {
            if (player1 == "rock") return win1;
            if (player1 == "paper") return win2;
        }
        if (player1 == "paper") {
            if (player2 == "scissors") return win2;
            if (player2 == "rock") return win1;
        }
        if (player2 == "paper") {
            if (player1 == "scissors") return win1;
            if (player1 == "rock") return win2;
        }
        return tie;
    }

    //    6
    public static short bugger(int num) {
        short res = 0;
        int n = num;
        while (n > 9) {
            int newNum = 1;
            while (n != 0) {
                newNum *= n % 10;
                n /= 10;
            }
            n = newNum;
            res++;
        }
        return res;
    }

    //    7
    public static String mostExpensive(Object[][] arr) {
        int maxPrice = 0;
        String res = "Наиб. общ. стоимость у предмета";
        for (Object[] objects : arr) {
            int price = (int) objects[1] * (int) objects[2];
            if (price > maxPrice) maxPrice = price;
        }
        for (Object[] objects : arr) {
            int price = (int) objects[1] * (int) objects[2];
            if (price == maxPrice) res = res + " " + objects[0] + " - " + price;
        }
        return res;
    }

    //    8
    public static String longestUnique(String str) {
        ArrayList<String> arr = new ArrayList<>();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!res.contains(String.valueOf(ch))) {
                res += ch;
            } else {
                arr.add(res);
                res = "";
            }
        }
        Collections.sort(arr);
        return arr.getFirst();
    }

    //    9
    public static boolean isPrefix(String word, String prefix) {
        return (word.substring(0, prefix.length() - 2).equals(prefix.substring(0, prefix.length() - 2)));
    }

    public static boolean isSuffix(String word, String suffix) {
        System.out.println(word.length() - suffix.length());
        return (word.substring(word.length() - (suffix.length() - 1)).equals(suffix.substring(1)));
    }

    //    10
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (
                (a <= h && (b <= w) || c <= w) || // a = высота, b = ширина, c = глубина
                        (b <= h && (a <= w)) || // b = высота, a = ширина, c = глубина
                        (c <= h && (b <= w)) // c = высота, b = ширина, a = глубина
        );
    }

}

