package Util;

import java.util.Scanner;

public class Input {
  private Scanner scn;

  public String getString(String question){
      System.out.println(question);
      return scn.nextLine();
  }

  public boolean yesNo(String question){
      System.out.println(question);
      String userInput = scn.nextLine();
      if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
          return true;
      } else {
          return false;
      }
  }

  public int getInt(int min, int max, String question){
      System.out.println(question);
      int userInput = scn.nextInt();
      while (userInput <= min && userInput >=  max){
          System.out.println(question);
          userInput = scn.nextInt();
      }
          return userInput;

  }

  int getInt(String question){
      System.out.println(question);
      String userInput = scn.nextLine();
      try {
          Integer.parseInt(userInput);
      } catch (Exception e){
          System.out.println("Something went wrong: " + e.getMessage());
      }
      return Integer.parseInt(userInput);
  }

  double getDouble(double min, double max, String question){
      System.out.println(question);
      double userInput = scn.nextDouble();
      while (userInput <= min && userInput >=  max){
          System.out.println(question);
          userInput = scn.nextDouble();
      }
      return userInput;
  }

  double getDouble(String question){
      System.out.println(question);
      String userInput = scn.nextLine();
      try {
          Double.parseDouble(userInput);
      } catch (Exception e){
          System.out.println("Something went wrong: " + e.getMessage());
      }
      return Double.parseDouble(userInput);
  }

}
