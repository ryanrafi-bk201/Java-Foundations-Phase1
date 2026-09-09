package section2_operators;

public class P4_TernaryStatus {
    public static void main(String[] args) {
        int responseTime = 450; // milliseconds
        String status;

        status = responseTime < 500 ? "FAST" : "SLOW";
        System.out.println(status);
    }
}
