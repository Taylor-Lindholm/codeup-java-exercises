import java.security.PublicKey;
import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(subtract(4,2));
        System.out.println(multiply(4,2));
        System.out.println(add(4,2));
        System.out.println(divide(4,2));
        System.out.println(modulus(4,2));

    }
    public static long subtract(int num1, int num2){
        return num1 -num2;
    }
    public static long multiply(int num1, int num2){
        return num1 * num2;
    }
    public static long add(int num1, int num2){
        return num1 + num2;
    }
    public static long divide(int num1, int num2){
        return num1 / num2;
    }
    public static long modulus(int num1, int num2){
        return num1 % num2;
    }
}
