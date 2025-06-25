
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
        // switch (day) {
        //     case 1: 
        //     case 2: 
        //     case 3:
        //     case 4: 
        //     case 5: 
        //     System.out.println("Weekday");
        //     break;
        //     case 6:
        //     case 7:
        //     System.out.println("Weekend");
        //     break;
        // }

        // Enhanced switch statement
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please enter a valid day number (1-7)");
        }
    }
    
}
