import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
        System.out.println("Hi im Bob Want to have a conversation?");
        Scanner scn = new Scanner(System.in);
        String answer = scn.nextLine();
        if (answer.endsWith("?")){
            System.out.println("Sure.");
        } else if (answer.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (answer.length() == 0){
            System.out.println("Fine. Be that way.");
        } else {
            System.out.println("Whatever.");
        }


    }
}
