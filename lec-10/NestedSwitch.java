
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Sarthak");
                break;
            case 2:
                System.out.println("Kushagra");
                break;
            case 3:
                System.out.println("Emp no. 3"); 
                // Nested switch statement
                switch (department) {
                    case "IT":  
                        System.out.println("IT Department");
                        break;          
                    case "Management":
                        System.out.println("Management Department");
                        break;    
                    default:
                        System.out.println("Please enter a valid department name");
                }
                break;
            default:
                System.out.println("Please enter a valid employee ID");
        }               


    }
    
}
