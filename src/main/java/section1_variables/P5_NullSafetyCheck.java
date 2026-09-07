package section1_variables;

public class P5_NullSafetyCheck {
    public static void main(String[] args) {
        String errorMessage = null; // Page had no error
        int length = (errorMessage != null) ? errorMessage.length() : 0;
        System.out.println("Error length: " + length);
    }
}
