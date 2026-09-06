package string.class_problems;

public class M4_MaskedPhoneNumber {

    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }

        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("XXXXXX");
        sb.append("-");
        sb.append(phone.substring(6));

        return sb.toString();
    }

    public static void main(String[] args) {
        String phone1 = "9876543210";
        System.out.printf("Input: \"%s\"%nOutput: %s%n%n", phone1, maskPhoneNumber(phone1));

        String phone2 = "98765";
        System.out.printf("Input: \"%s\"%nOutput: %s%n", phone2, maskPhoneNumber(phone2));
    }
}
