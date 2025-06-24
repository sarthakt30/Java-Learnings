public class Reverse {
    public static void main(String[] args) {
        int num = 123456;

        int ans = 0;

        while (num >0 ) {
            int rem = num % 10; // Get the last digit
            num /= 10; // Remove the last digit from num

            ans = ans * 10 + rem; // Build the reversed number
        }
        System.out.println(ans); // Print the reversed number
    }
    
}
