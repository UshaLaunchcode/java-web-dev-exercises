package textbookexamples.controlflowandcollections;
import java.util.Scanner;
//Using else if in java
public class ElseIf {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a grade: ");
        int grade = in.nextInt();
        in.close();
        if (grade < 60) {
            System.out.println('F');
        } else if (grade < 70) {
            System.out.println('D');
        } else if (grade < 80) {
            System.out.println('C');
        } else if (grade < 90) {
            System.out.println('B');
        } else {
            System.out.println('A');
        }
    }

}
