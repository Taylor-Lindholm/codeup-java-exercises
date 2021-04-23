import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Enter a number between 1 and 5.");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        switch (answer) {
            case 1:
                System.out.print("1's kinda basic");
                break;
            case 2:
                System.out.print("Whats better then 1? 2!");
                break;
            case 3:
                System.out.print("Three to the knee.");
                break;
            case 4:
                System.out.print("4... 4 more?");
                break;
            case 5:
                System.out.print("Always got pick the biggest huh?");
                break;
        }

        int myFavoriteNumber = 72;
        String myString = "Five thousand years later...";
        System.out.println(myString);
//        float myNumber = 123L;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 4 + 5;
//        int y = 4 * 3;
//        int x = 10 / 2;
//        int y = 2 - 10;

    }



}
