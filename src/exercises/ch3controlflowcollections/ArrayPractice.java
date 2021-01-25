package exercises.ch3controlflowcollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String args[]) {
        ArrayPractice arrayPractice = new ArrayPractice();
       // arrayPractice.printOddNumbers();
      //arrayPractice.splitAGivenString();
        arrayPractice.splitAGivenStringIntoSentences();
   }

    public void printOddNumbers() {
        int arrayOfInt[] = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i <= arrayOfInt.length; i++) {
            //Print odd numbers of the given array
            if ((arrayOfInt[i] % 2) == 1) {
                System.out.println(arrayOfInt[i]);

            }
        }

    }

    public void splitAGivenString() {
        String givenString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String splitStrings[] = givenString.split(" ");
        System.out.println(Arrays.toString(splitStrings));
    }

    public void splitAGivenStringIntoSentences() {
        String givenString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String splitStrings[] = givenString.split("\\.");
        System.out.println(Arrays.toString(splitStrings));
    }
}
