import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person){
        int length = people.length;
        Person[] newArray = Arrays.copyOf(people, length + 1);
        newArray[length] = new Person(person.getName());
        return newArray;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Brae");
        people[1] = new Person("Alex");
        people[2] = new Person("Scott");

        for (Person person : people){
            System.out.println(person.getName());
        }
        Person[] newPerson = addPerson(people, new Person("Kenneth"));

        for (Person person : newPerson) {
            System.out.println(person.getName());
        }
    }

}
