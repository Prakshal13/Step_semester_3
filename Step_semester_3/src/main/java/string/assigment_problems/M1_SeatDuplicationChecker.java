package string.assigment_problems;

public class M1_SeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length == 0) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean[] alreadyReported = new boolean[seatNumbers.length];
        boolean duplicateFound = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) {
                continue;
            }

            boolean isDup = false;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    isDup = true;
                    alreadyReported[j] = true;
                }
            }

            if (isDup) {
                System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                duplicateFound = true;
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] input1 = {101, 102, 103, 102, 105};
        System.out.print("Input: {101, 102, 103, 102, 105} -> ");
        checkDuplicateSeats(input1);

        int[] input2 = {101, 102, 103, 104, 105};
        System.out.print("Input: {101, 102, 103, 104, 105} -> ");
        checkDuplicateSeats(input2);
    }
}
