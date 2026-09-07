package section1_variables;

public class P4_IntOverflowDetective {
    public static void main(String[] args) {
        int usersPerDay = 50000;
        int daysInYear = 365;
        int years = 200;
        long totalIds = (long) usersPerDay * daysInYear * years;  // Need to type cast to long to generate big int
        System.out.println("Total IDs needed: " + totalIds);
    }
}
