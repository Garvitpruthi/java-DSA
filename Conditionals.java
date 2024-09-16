import java.util.*;

public class Conditionals{
    public static void main(String[] args){
        // // do{

        // // } while(condition);

        // int a = 2;
        // int b = 5;
        // // System.out.println(Math.max(a, b));


        // Scanner in = new Scanner(System.in);
        // char ch  = in.next().trim().charAt(0);
        // System.out.println(ch);

        int num = 0;
        int n = 23597;
        int place = 10;

        while(n != 0){
            int rem = n%10;
            num = num*place + rem;
            n/= 10;
        }
        System.out.println(num);

    }
}