package section2_Operators;

public class P2_TestDistribution {
    public static void main(String[] args) {
        int testCases = 23;
        int qa = 5;
        int eachPersonDistribution = testCases / qa;
        int remainder = testCases % qa;

        System.out.println("Each person gets: " + eachPersonDistribution + " test cases");
        System.out.println("Remainder: " + remainder + " test cases");
    }
}
