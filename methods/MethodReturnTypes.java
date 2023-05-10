package methods;
import java.util.Scanner;

public class MethodReturnTypes {
    public static void main (String[] args) {
        String s =methodString();
        System.out.println(s);

        int number = methodInt();
        System.out.println(number);

        int num1 = 9;
        if (trueOrFalse(num1) == true){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
    public static String methodString() {
        return "String of text";
    }
    public static int methodInt(){
        int num = 9;
        return num;
    }
    public static boolean trueOrFalse(int num1) {
        return (num1 % 5 == 0);
    }
}
