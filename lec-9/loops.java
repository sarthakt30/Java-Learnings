
import java.util.Scanner;





public class loops {
    public static void main(String[] args) {
        //Q: Print numbers from 1 to 5
        /*
        syntax of FOR LOOPS:
        for (initialisaton; condition; increment/decrement) {
        //body
        }
        */    
        //num++
        //num += 1

        // for (int num = 1; num <= 5; num++){
        //     System.out.println(num);
        // }

        //print numbers from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for (int num = 1; num <= n; num += 1) {
        //     //System.out.println(num); 
        //     System.out.println("Hello World");
        // }


        //WHILE LOOPS - Syntax
        /*
         * Syntax:
         * while (condition) {
         * body
         * } 
         */

        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        
         int num = 1;
        while ( num <= n) {
            System.out.println(num);
            num++;
        }
    }
    
}
