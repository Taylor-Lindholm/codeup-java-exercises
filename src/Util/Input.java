package Util;

import java.util.Scanner;

public class Input {
    private static Scanner scn;

    public Input(){
        this.scn = new Scanner(System.in);
    }

    public String getString(String question){
        System.out.println(question);
        String userStringInput = scn.nextLine();
        return userStringInput;
    }
    public static boolean yesNo(){
        System.out.println("Continue yes or no");
        String userBoolean = scn.nextLine();
        if (userBoolean.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max){
        int userInt = scn.nextInt();
        while (userInt >= max || userInt <= min){
            System.out.println("What would you like to do?");
            System.out.println(" ");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
             userInt = scn.nextInt();
        }
        return userInt;
    }
    static int getInt(){
        System.out.println("Pleae enter an integer");
        int userInt = scn.nextInt();
        return userInt;
    }
    static double getDouble(double min, double max){
        System.out.println("Please enter an integer");
        double userDouble = scn.nextDouble();
        return userDouble;
    }
    public static double getDouble(){
        scn = new Scanner(System.in);
        return scn.nextDouble();
    }

}
