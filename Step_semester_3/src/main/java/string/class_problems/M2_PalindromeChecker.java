package string.class_problems;

public class M2_PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        if (text == null) return false;
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null) return false;
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) return false;
        char[] chars = text.toCharArray();
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void displayResults(String text) {
        boolean iter = isPalindromeIterative(text);
        boolean recur = isPalindromeRecursive(text);
        boolean arr = isPalindromeArrayReversal(text);

        String iterRes = iter ? "Palindrome" : "Not Palindrome";
        String recurRes = recur ? "Palindrome" : "Not Palindrome";
        String arrRes = arr ? "Palindrome" : "Not Palindrome";

        System.out.printf("Input: \"%s\"%n", text);
        System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s%n%n",
                iterRes, recurRes, arrRes);
    }

    public static void main(String[] args) {
        displayResults("madam");
        displayResults("hello");
    }
}
