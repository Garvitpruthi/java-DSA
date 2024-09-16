import java.util.*;
public class VairiableArgs{
    public static void main(String[] args) {
        fun();
        fun(2,3,4,5,1,2,9);
        multipleArgs(2, 3, "garvit", "rahul", "systum");
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void multipleArgs(int a, int b, String ...v){. /// variable length arguments always at the end;

    }
}