package string.assigment_problems;

public class M1_AtmPinValidator {

    public static void checkPinLength(String pin) {
        if (pin != null && pin.length() == 4) {
            System.out.println("PIN length OK.");
        } else {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        }
    }

    public static void main(String[] args) {
        String pin1 = "482";
        System.out.printf("Input: \"%s\"%nOutput: ", pin1);
        checkPinLength(pin1);

        String pin2 = "4820";
        System.out.printf("%nInput: \"%s\"%nOutput: ", pin2);
        checkPinLength(pin2);
    }
}
