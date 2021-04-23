import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//        double x = 2;
//        do {
//            System.out.println(x);
//            x = Math.pow(x, 2);
//        }while(x <= 1000000);
//    }
        for (int i = 0; i <= 15; i++) {
            System.out.println("i is " + i);
        }
        for (double i = 2; i <= 1000000; i *= i) {
            System.out.println(i);
        }
        for (int i = 0; i <= 100; i++){
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        StringBuilder str = new StringBuilder();
        Scanner scn = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userNumber = scn.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for ( int i = 0; i <= userNumber; i++ ){
            System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));

        }
        System.out.println("What is your numerical grade?");
        int grade = scn.nextInt();
        System.out.println("Would you like to continue? [y/N]");
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine();
        boolean confirmation = userAnswer.equals("y");
        if (confirmation){
            if (grade <= 59){
                System.out.println("f");
            } else if (grade <= 66) {
                System.out.println("d");
            } else if (grade <= 79) {
                System.out.println("c");
            } else if (grade <= 87) {
                System.out.println("b");
            } else if (grade <= 100){
                System.out.println("a");
            } else {
                System.out.println("Not a valid grade.");
            }
        } else if (!confirmation) {
            System.out.println("Ok cya later.");
        }


    }}