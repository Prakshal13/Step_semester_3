package oop.assigment_problems;

class MembershipCard {
    String studentName;

    static String libraryName;
    static String validUntil;

    static {
        libraryName = "SRM Central Library";
        validUntil = "May 2027";

        System.out.println("Library info loaded");
    }

    MembershipCard(String studentName) {
        this.studentName = studentName;
    }

    void display() {
        System.out.println("Membership card issued: " + studentName);
    }
}

public class A4_LibraryCardSetup {
    public static void main(String[] args) {
        String[] names = {
            "Ananya",
            "Rohan",
            "Priya",
            "Arjun",
            "Sneha"
        };

        for (String name : names) {
            MembershipCard card = new MembershipCard(name);
            card.display();
        }
    }
}
