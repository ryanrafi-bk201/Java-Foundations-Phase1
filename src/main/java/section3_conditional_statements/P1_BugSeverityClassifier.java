package section3_conditional_statements;

import java.util.Scanner;

public class P1_BugSeverityClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input < 200) {
            System.out.println("Excellent");
        } else if (input < 500) {
            System.out.println("Acceptable");
        } else if (input < 1000) {
            System.out.println("Slow");
        } else if (input < 3000) {
            System.out.println("Critical");
        } else {
            System.out.println("Blocker");
        }
    }
}
