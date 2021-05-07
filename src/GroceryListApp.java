import Util.Input;

import java.util.HashMap;

public class GroceryListApp {
    public static void main(String[] args) {
        Input userAnswer = new Input();

        HashMap<String, Integer> groceryList = new HashMap<>();

        while (true) {

            Boolean options = userAnswer.yesNo("Would you like to keep adding to your grocery list??");

            if (options) {
                System.out.println("Current list items are: " + groceryList);
                String shoppingItem = userAnswer.getString("What grocery item would you like to add?");
                System.out.println("Item added.");
                Integer numberOfItems = userAnswer.getInt("How many " + shoppingItem + "s would you like to add?");
                groceryList.put(shoppingItem, numberOfItems);
                System.out.println(groceryList);
            } else {
                System.out.println("Enjoy your day");
                break;
            }
        }
    }
}
