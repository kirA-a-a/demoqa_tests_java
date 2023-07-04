package guru.qa;

import static java.lang.System.in;
import static java.lang.System.out;

public class NumberMath {

    public static void main(String[] args) {
        out.println("Helloвй");
        NumberMath.sumInt(1,2);
    }

    public static int sumInt(int num1, int num2) {
        int result = num1 + num2;
        out.println(result);
        return result;
    }
}
