import java.util.Scanner;

public class Enhancedswitch {
    public static void main(String[] args) {
        // Enhanced switch statement
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // switch (fruit) {
        //     case "Mango" -> System.out.println("King of fruits");
        //     case "Apple" -> System.out.println("A sweet red fruit");
        //     case "Orange" -> System.out.println("A round fruit");
        //     case "Grapes" -> System.out.println("A small green or purple fruit");
        //     case "Avocado" -> System.out.println("A creamy green fruit");
        //     default -> System.out.println("Please enter a valid fruit name");
            
        // }

        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter a valid day number (1-7)"); 

        }

    }
    
}

    