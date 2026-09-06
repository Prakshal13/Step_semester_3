package string.class_problems;

public class M3_BmiCalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        int n = Math.min(heights.length, weights.length);

        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-12s | %-10s | %-15s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            double h = heights[i];
            double w = weights[i];
            double bmi = w / (h * h);
            String status = getBmiStatus(bmi);

            System.out.printf("%-10s | %-12.2f | %-12.2f | %-10.2f | %-15s%n",
                    "Person " + (i + 1), h, w, bmi, status);
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Sample test team (including sample values: 1.75m/70kg and 1.60m/90kg)
        double[] heights = {1.75, 1.60, 1.80, 1.65, 1.70, 1.55, 1.85, 1.72, 1.68, 1.78};
        double[] weights = {70.0, 90.0, 60.0, 75.0, 68.0, 42.0, 95.0, 80.0, 58.0, 72.0};

        System.out.println("Sample Individual Outputs:");
        for (int i = 0; i < 2; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            System.out.printf("Person %d — Height: %.2f m, Weight: %.0f kg -> BMI: %.2f | Status: %s%n",
                    (i + 1), heights[i], weights[i], bmi, getBmiStatus(bmi));
        }

        System.out.println("\nFull Team Wellness Report (10 Persons):");
        printWellnessReport(heights, weights);
    }
}
