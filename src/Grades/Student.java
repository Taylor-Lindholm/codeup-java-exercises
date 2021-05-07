package Grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, int[] grade){
        this.name = name;
        for (int i = 0; i < grade.length; i++) {
            addGrade(grade[i]);
        }
    }

    public String getName(){
        return name;
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int number = grades.size();
        double sum = 0;
        for (int i = 0; i < number; i++){
            sum += grades.get(i);
        }
        return sum / number;

    }

    public static void main(String[] args) {

        Student John = new Student("john", new int[]{64, 39, 80});
        System.out.println(John.getGradeAverage());

    }

}
