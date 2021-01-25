package textbookexamples.controlflowandcollections;
import java.util.Scanner;
//What if we ommit break in switch case
public class FallthroughDayPrinter {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int dayNum = in.nextInt();
        in.close();
        String day;
        switch (dayNum) {
            case 0:
                day = "Sunday";
            case 1:
                day = "Monday";
            case 2:
                day = "Tuesday";
            case 3:
                day = "Wednesday";
            case 4:
                day = "Thursday";
            case 5:
                day = "Friday";
            case 6:
                day = "Saturday";
                //break;
            default:
                day = "Int does not correspond to a day of the week";
        }
        System.out.println(day);
    }
}

