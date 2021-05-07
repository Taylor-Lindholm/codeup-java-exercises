package Grades;

import Util.Input;

import java.util.HashMap;

import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student bob = new Student("bob", new int[] {78, 90, 105});
        Student taylor = new Student("taylor", new int[] {81, 92, 100});
        Student brandon = new Student("brandon", new int[] {13, 45, 66});
        HashMap<String, Student> students = new HashMap<>();
        students.put("bob", bob);
        students.put("taylor", taylor);
        students.put("brandon", brandon);

        Input selectedStudent = new Input();
        System.out.println(students.keySet().toString());
        String username = selectedStudent.getString("enter a github username");
        System.out.println(students.get(username).getGradeAverage());

    }


}
