package section2_Operators;

public class P3_ShortCircuit {
    public static void main(String[] args) {
        String username = null;
        if (username != null && username.length() > 0) {
            System.out.println("Username is valid");
        } else {
            System.out.println("Username is empty or null");
        }
        // What if we use | instead of || ?
        if (username != null | username.length() > 0) {
            System.out.println("This line?");               // Will not compile
        }
    }
}
