package string.class_problems;

public class M2_CsvStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csvLine.split(",");
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();

        System.out.printf("Name: %s | Roll No: %s | Dept: %s%n", name, rollNo, dept);
    }

    public static void main(String[] args) {
        String record1 = "Ananya Verma,RA2211003010123,CSE";
        System.out.printf("Input: \"%s\"%nOutput: ", record1);
        parseStudentRecord(record1);

        String record2 = "Ananya Verma,CSE";
        System.out.printf("%nInput: \"%s\"%nOutput: ", record2);
        parseStudentRecord(record2);
    }
}
