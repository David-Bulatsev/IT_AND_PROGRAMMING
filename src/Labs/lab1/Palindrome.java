package Labs.lab1;

public class Palindrome {
    public static void main(String[] args) {
        for (String arg : args) {
            if (isPalindrome(reverseString(arg), arg)) {
                System.out.println("The word " + arg + " is a palindrome");
            }
            else {
                System.out.println("The word " + arg + " is NOT a palindrome");
            }
        }
    }

    public static String reverseString(String s) {
        StringBuilder word = new StringBuilder();
        for (int i = s.length(); --i >= 0;) {
            word.append(s.charAt(i));
        }

        return word.toString();
    }

    public static boolean isPalindrome(String str, String newStr) {
        return str.equals(newStr);
    }
}
