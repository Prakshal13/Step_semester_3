package string.assigment_problems;

public class M2_TypingSpeedChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input strings.");
            return;
        }

        int total = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char origChar = ' ';
        char typedChar = ' ';

        int minLen = Math.min(original.length(), typed.length());
        for (int i = 0; i < minLen; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position
                origChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = total > 0 ? ((double) matched / total) * 100.0 : 0.0;

        if (firstMismatchPos == -1 && original.length() == typed.length()) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, total, accuracy);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, firstMismatchPos, origChar, typedChar);
        }
    }

    public static void main(String[] args) {
        String orig1 = "hello world";
        String typed1 = "hello worlt";
        System.out.println("original=\"" + orig1 + "\", typed=\"" + typed1 + "\"");
        checkTypingAccuracy(orig1, typed1);

        String orig2 = "coding";
        String typed2 = "coding";
        System.out.println("\noriginal=\"" + orig2 + "\", typed=\"" + typed2 + "\"");
        checkTypingAccuracy(orig2, typed2);
    }
}
