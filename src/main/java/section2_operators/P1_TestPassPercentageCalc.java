package section2_operators;

public class P1_TestPassPercentageCalc {
    public static void main(String[] args) {
        int passed = 84;
        int failed = 12;
        int skipped = 4;
        int total = passed + failed + skipped;
        boolean threshold = false;

        double passedPercentage = (double) passed / total * 100;
        double failedPercentage = (double) failed / total * 100;

        System.out.println("Total test count: " + total);
        System.out.println("Passed: " + String.format("%.2f", passedPercentage) + "%");
        System.out.println("Failed: " + String.format("%.2f", failedPercentage) + "%");

        if (passedPercentage >= 90) {
            threshold = true;
        }

        System.out.println("Threshold: " + threshold);
    }
}
