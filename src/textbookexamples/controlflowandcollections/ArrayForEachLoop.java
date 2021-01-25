package textbookexamples.controlflowandcollections;
//for-each loop for each integer in an array
public class ArrayForEachLoop {
    public static void main(String args[]) {
        int nums[] = {1, 1, 2, 3, 5, 8, 13, 21};

        for (int i : nums) {
            System.out.println(i);
        }
    }
}
