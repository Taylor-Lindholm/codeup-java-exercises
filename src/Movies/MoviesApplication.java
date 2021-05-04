package Movies;

import Util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        Input movieInput = new Input();

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
        int userInput = movieInput.getInt(0, 5);
        MoviesArray movieList = new MoviesArray();
        switch(userInput){
            case 0:
                System.out.println("Thanks! Come again!");
            case 1:
                for (int i = 0; i >= movieList.length )
        }

    }

}
