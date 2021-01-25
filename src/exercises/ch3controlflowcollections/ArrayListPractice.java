package exercises.ch3controlflowcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
       // ArrayList<Integer> numbersToSum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
       // Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
       // System.out.println("The sum of all the even numbers: " + theSum.toString());
        ArrayList<String> wordsToSearch = new ArrayList<>(Arrays.asList("Dog", "Horse", "Cat"));
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch);
    }
    //Print words with five letters of given words of ArrayList
    public static void printWordsWithFiveLetters(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == 5) {
                System.out.println(words.get(i));
            }
        }
    }
           //Print sum of all even numbers in the given numbers of ArrayList
            public static Integer sumAllEvenValues(ArrayList < Integer > valuesToSum) {
                Integer sum = 0;
                for (int i = 0; i < valuesToSum.size(); i++) {
                    if ((valuesToSum.get(i) % 2) == 0) {
                        sum = sum + valuesToSum.get(i);

                    }

                }
                return sum;
            }
        }


