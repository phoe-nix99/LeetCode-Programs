import java.util.*;

public class Exception2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            int c = a / b;

            System.out.println(c);
        }
        catch(ArithmeticException c) {
            System.out.println("Cannot Divide With Zero");
        }
    }
}