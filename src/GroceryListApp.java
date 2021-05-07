import Util.Input;

import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        Input userAnswer = new Input();

        HashMap<String, Integer> groceryList = new HashMap<>();

        while (true) {

            String yesNo = userAnswer.getString("Would you like to keep adding to your grocery list??");

            if (yesNo.equals("yes")) {
                System.out.println("Current list items are: " + groceryList);
                String shoppingItem = userAnswer.getString("What grocery item would you like to add?");
                System.out.println("Item added.");
                Integer numberOfItems = userAnswer.getInt("How many items would you like to add?");
                groceryList.put(shoppingItem, numberOfItems);
                System.out.println(groceryList);
            } else {
                System.out.println("Enjoy your day");
                break;
            }
        }
    }
}
