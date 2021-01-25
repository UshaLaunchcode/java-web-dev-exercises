package exercises.ch2datatypes;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUsersSearchTerm();
        Boolean myReturnedResult = myFirstAlice.searchAliceQuote(searchTerm);
        System.out.println("The result is: " + myReturnedResult);
    }
    public String getUsersSearchTerm(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search:");
        String searchTerm = input.nextLine();
        input.close();
        return searchTerm;
    }
        public boolean searchAliceQuote(String searchterm){
        String theQuote = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchterm.toLowerCase();
        boolean result = theQuoteLowerCase.contains(searchTermLowerCase);
        return result;

    }
}
