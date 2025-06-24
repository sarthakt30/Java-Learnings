
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // Check if a character is uppercase, lowercase, or not an alphabet

        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0); // Read a character from input
        
        //char ch = 'A'; // Example character, you can change this to test other characters

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Lowecase");
        }
    }
    
}
