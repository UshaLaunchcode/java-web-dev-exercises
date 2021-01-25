package textbookexamples.controlflowandcollections;
//If you want to start at 100, stop at 0 and count backward by 5
public class ForLoopPrintDownNums {
    public static void main(String args[]) {
        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }
}
