
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        
        // if ( a > b && a > c) {
        //     System.out.println("A is largest" + a);
        // } else if ( b > a && b > c) {
        //     System.out.println("B is largest" + b);
        // } else {
        //     System.out.println("C is largest" + c);
        // }
           

        //KK
        int max = a; // Assume a is the largest initially
        if (b > max) {
            max = b; // Update max if b is larger
        } 
        if (c > max) {
            max = c; // Update max if c is larger
        }
        System.out.println("Largest is " + max);
        


    }
    
}
