import java.util.Scanner;
public class Person {

    System.out.println("Please enter name");
    Scanner scn = new Scanner(System.in);
    public String name = scn.nextLine();
    public String getName(){
        return name;
    }

    public void setName(String name){
    this.name = name;
    }
    public void sayHello(){
    System.out.println("Hello " + name);
    }

}
