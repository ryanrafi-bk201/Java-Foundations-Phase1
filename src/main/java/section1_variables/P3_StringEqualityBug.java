package section1_variables;

public class P3_StringEqualityBug {
    public static void main(String[] args) {
        String expected = "Login Successful";
        String actual = new String("Login Successful");  // String created dynamically

        if (expected == actual) {          // Will not match as dynamically created string points to different address, need to do .equals()
            System.out.println("✅ Test PASSED");
        } else {
            System.out.println("❌ Test FAILED");
        }
    }
}
