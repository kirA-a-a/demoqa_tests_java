package guru.qa;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        out.println("Hello");

        Main.sumInt(2147483647, 1);
        Main.sumByte((byte) 127, (byte) 1);
        Main.sumDifferent(5, 2.5);
    }
// Задание 0

//    Типы данных в Java:
//    Целочисленные типы данных:
    byte varByte = 1; // -128..127
    short varShort = 1; // -32,768..32,767
    int varInt = 1; // -2,147,483,648..2,147,483,647
    long varLong = 1; // -9,223,372,036,854,775,808..9,223,372,036,854,775,807

    // Числа с плавабщей точкой
    float varFloat = 1.01F;
    double varDouble = 1.02;

    // Задание 1
    public static int sumInt(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
        return result;
    }

    public static byte sumByte(byte num1, byte num2) {
        byte result = (byte) (num1 + num2);
        out.println(result);
        return result;
    }

    // Задание 2


    public static double sumDifferent(int num1, double num2) {
        double result = num1 + num2;
        out.println(result);
        return result;
    }

}
