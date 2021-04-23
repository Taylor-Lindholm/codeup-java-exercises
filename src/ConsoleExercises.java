import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //        double pi = 3.14159;
//        System.out.println("The value of pi is approximately: " + pi);
        System.out.print("Please enter your name.");
        Scanner scn = new Scanner(System.in);
        String userInput = scn.nextLine();
        System.out.print(userInput);

        System.out.println("Please enter width.");
        int widthNumber = scn.nextInt();
        System.out.println("Please enter height.");
        int heightNumber = scn.nextInt();
        int area = widthNumber * heightNumber;
        System.out.print("Your area is: " + area);

        System.out.print("Continue? [y/N] ");
        String userAns = scn.next();
        boolean confirmation = userAns.equals("y");
        if (confirmation) {
            System.out.print("Look at you you cheeky bastard using conditionals.");
        } else if (!confirmation){
            System.out.print("You little rebel.");
        }




    }


}
