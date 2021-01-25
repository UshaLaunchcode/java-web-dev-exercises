package textbookexamples.classesandpbjects;

import exercises.ch4classesobjectspart1.school.Student;
//toString example
public class MyToString {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public MyToString(String name) {
        this.name = name;
    }

    public String toString() {
       return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }


    public static void main(String[] args) {
        MyToString person = new MyToString("Violet");
       // toString is often implicitly called
        System.out.println(person);
        //Also toString can be called like below
        //System.out.println(person.toString());
    }
}
