package textbookexamples.controlflowandcollections;
//for-each loop for each character in a String
public class StringForEachLoop {
    public static void main(String args[]) {
        String msg = "Hello World";
        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
    }
}