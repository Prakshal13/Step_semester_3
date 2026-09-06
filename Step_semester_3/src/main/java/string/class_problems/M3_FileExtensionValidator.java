package string.class_problems;

public class M3_FileExtensionValidator {

    public static String validateFileExtension(String filename) {
        if (filename == null || filename.lastIndexOf('.') == -1) {
            return "Rejected — invalid file type";
        }

        int dotIndex = filename.lastIndexOf('.');
        String ext = filename.substring(dotIndex + 1);

        if (ext.equalsIgnoreCase("pdf") || ext.equalsIgnoreCase("docx") || ext.equalsIgnoreCase("zip")) {
            return "Accepted";
        } else {
            return "Rejected — invalid file type";
        }
    }

    public static void main(String[] args) {
        String file1 = "Assignment1.PDF";
        System.out.printf("Input: \"%s\"%nOutput: %s%n%n", file1, validateFileExtension(file1));

        String file2 = "notes.txt";
        System.out.printf("Input: \"%s\"%nOutput: %s%n", file2, validateFileExtension(file2));
    }
}
