package section1_variables;

public class P2_TypeCastingTrap {
    public static void main(String[] args) {
        int totalTests = 7;
        int passed = 3;

        double passRate = passed / totalTests;
        System.out.println("Pass rate A: " + passRate);  // Int division truncates to 0

        double passRateB = (double) passed / totalTests;
        System.out.println("Pass rate B: " + passRateB);  // Gets rounded

        int rounded = (int) 4.99;
        System.out.println("Rounded: " + rounded);  // Gets truncated to 4
    }
}
