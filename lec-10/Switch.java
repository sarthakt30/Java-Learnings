
import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // switch statement
        switch (fruit) {
            case "Mango":
            System.out.println("King of fruits");
            break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            case "Orange":
            System.out.println("A round fruit");
            break;
            case "Grapes":
            System.out.println("A small green or purple fruit");
            break;
            case "Avacado":
            System.out.println("A creamy green fruit");
            default:
            System.out.println("Please enter a valid fruit name");
        }    

    }
    
}
