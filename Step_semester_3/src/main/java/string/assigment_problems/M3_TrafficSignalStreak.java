package string.assigment_problems;

public class M3_TrafficSignalStreak {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signal readings found.");
            return;
        }

        char longestChar = signalLog.charAt(0);
        int maxStreak = 1;

        char currentChar = signalLog.charAt(0);
        int currentStreak = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    longestChar = currentChar;
                }
                currentChar = signalLog.charAt(i);
                currentStreak = 1;
            }
        }

        // Final check for trailing streak
        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestChar = currentChar;
        }

        System.out.printf("Longest Streak: '%c' repeated %d times%n", longestChar, maxStreak);
    }

    public static void main(String[] args) {
        String log1 = "RRGGGYRR";
        System.out.printf("Input: \"%s\" -> ", log1);
        findLongestStreak(log1);

        String log2 = "RRRRYYGG";
        System.out.printf("Input: \"%s\" -> ", log2);
        findLongestStreak(log2);
    }
}
