package oop.class_problems;

class Student {

    String name;

    static String collegeName;
    static int academicYear;

    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = 2026;

        System.out.println("College info loaded");
    }

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student record created: " + name);
    }
}

public class M4_CollegeSetup {

    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Meera",
            "Karthik",
            "Divya",
            "Anitha"
        };

        for (String name : names) {

            Student student = new Student(name);

            student.display();
        }
    }
}