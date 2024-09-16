import java.util.Scanner;
import java.util.*;

public class Switch_case {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();

        // switch (fruit) {
        //     case "apple":
        //         System.out.println("cvery sweet");
        //         break;
            
        //     case "banana":

        //         System.out.println("long fruit");
        //         break;
            
        //     case "mango":
        //         System.out.println("king of all fruit");
        //         break;
            
        //     default:
        //         System.out.println("your fruit is not present");
            
        // }

        // switch (fruit) {
        //     case "mango" -> System.out.println("king of all fruit");
        //     case "apple" -> System.out.println("keeps the doctor away");
        //     case "banana" -> System.out.println("longest fruit");
        //     default -> System.out.println("your fruit is not here");
        // }

        int day = 1;
        // switch (day) {
        //     case 1:
        //     case 2:
        //     case 3: 
        //     System.out.println("you are in 3");
        //     case 4:
        //     System.out.println("u are in 4");
        // }

        // switch (day) {
        //     case 1, 2, 3, 4, 5 -> System.out.println("weekday");
        //     case 6, 7 -> System.out.println("Weekend");
        // }

        int id = 3;
        String department = "management";

        // switch (id) {
        //     case 1: 
        //         System.out.println("first");
        //         break;
        //     case 2: 
        //         System.out.println("second");
        //         break;
        //     case 3: 
        //         switch (department){
        //             case "management": 
        //                 System.out.println("management departmenet");
        //                 break;
        //             case "pharmacy":
        //                 System.out.println("pharmacy department");
        //                 break;
        //         }
        // }

        // better way 

        switch (id) {
            case 1 -> System.out.println("first");
            case 2 -> System.out.println("second");
            case 3 -> {
                System.out.println("three");
                switch (department) {
                    case "IT": System.out.println("it");
                    case "management": System.out.println("management");
                }
            }
        }
    }
}