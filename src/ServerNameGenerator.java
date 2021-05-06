import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[][] names = {
                {"adorable", "amused", "blue-eyed", "bright", "calm", "charming", "clever", "curious", "Defiant", "eager"},
                {"time", "person", "day", "world", "hand", "child", "case", "work", "problem", "fact"}
        };

        Random random = new Random();
        for (int i = 0; i < names.length; i++  ){
            int randomNumber = random.nextInt(names[i].length);

            System.out.print(names[i][randomNumber]);

        }





        }
    }


