package section3_conditional_statements;

import java.util.Scanner;

public class P2_LoginValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        boolean validPassword = false;

        if (username == null) {
            System.out.println("Username must not be null or empty");

            return;
        } else if (username.isEmpty()) {
            System.out.println("Username must not be null or empty");

            return;
        }

        if (password == null) {
            System.out.println("Password must be at least 8 characters");

            return;
        } else if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters");

            return;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                validPassword = true;
            }
        }

        if (!validPassword) {
            System.out.println("Password must contain at least one digit");
        }

        if (username.length() == password.length()) {
            System.out.println("Username must not equal password");

            return;
        }
    }
}
