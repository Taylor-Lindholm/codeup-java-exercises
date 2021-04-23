import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Enter a number.");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        System.out.println("You entered: " + answer);

        int myFavoriteNumber = 72;
        String myString = "Five thousand years later...";
        System.out.println(myString);
        float myNumber = 123L;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 4 + 5;
//        int y = 4 * 3;
//        int x = 10 / 2;
//        int y = 2 - 10;

        double pi = 3.14159;
        System.out.println("The value of pi is approximately: " + pi);
        System.out.print("Please enter three words.");
    }



}
