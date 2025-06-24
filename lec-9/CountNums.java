public class CountNums {
    public static void main(String[] args) {
        int n = 45536;

        int count = 0;
        while (n > 0) {
            int rem = n % 10; // Get the last digit
            if (rem == 5) {
                count++; // Increment count if the digit is 5           

            }
            n = n / 10;

        }
        System.out.println(count);
    }
    
}
