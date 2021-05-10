package Util;

import java.util.Scanner;

public class Input {
    private static Scanner scn;

    public Input(){
        this.scn = new Scanner(System.in);
    }

    public String getString(String question){
        System.out.println(question);
        this.scn = new Scanner(System.in);
        String userStringInput = scn.nextLine();
        return userStringInput;
    }
    public boolean yesNo(String question){
        System.out.println(question);
        this.scn = new Scanner(System.in);
        String userBoolean = scn.nextLine();
        if (userBoolean.equalsIgnoreCase("y")|| userBoolean.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }
    public int getInt(int min, int max){
        int userInt = scn.nextInt();
        while (userInt >= max || userInt <= min){
             userInt = scn.nextInt();
        }
        return userInt;
    }
    public int getInt(String question){
        System.out.println(question);
        this.scn = new Scanner(System.in);
        String userInt = scn.nextLine();
        try {
            Integer.valueOf(userInt);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
       return Integer.parseInt(userInt);
    }
    static double getDouble(double min, double max){
        System.out.println("Please enter an integer");
        double userDouble = scn.nextDouble();
        return userDouble;
    }
    public static double getDouble(){
        scn = new Scanner(System.in);
        String userDouble = scn.nextLine();
        try {
            Double.valueOf(userDouble);
        } catch (Exception e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
        return Double.parseDouble(userDouble);
    }

}
