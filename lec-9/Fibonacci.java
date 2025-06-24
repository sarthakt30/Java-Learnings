
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // Start from the third term

        while (count <= n) {
            int temp = b;
            b = b + a; // Calculate the next Fibonacci number
            a = temp; // Update 'a' to the previous 'b'
            count++;
        }
        System.out.println(b); // Print the nth Fibonacci number 
    }
    
}
