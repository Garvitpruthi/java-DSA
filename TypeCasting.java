import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // Type Casting
        // int num = (int)(67.56f);
        // System.out.println(num);

        // automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte)(a); // 257%256 = 1; max i can store is 256;
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c; // result of intermediate term a*b easily exceeds the range of byte operator, to handle this java automatically is promoting each byte to integer when it is evaluating the expression a * b; therefore the action * is performed using integers even though they are bytes  
        // System.out.println(d);
        

        // byte b = 50;
        // b = b*2; // this will u give in error, because whenever u are performing this evaluations it automatically converted into int and since after evalution it is an integer now, how can u assign this to a byte.


        int number = 'A';
        System.out.println(number);


        byte b = 42;
        char c = 'a';
        short s = 1034;
        int i = 5000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        // output is -> float + int - double = double

        System.out.println((f*b) + " " + (i/c) +  " " + (d*s));
        System.out.println(result);
    }
}