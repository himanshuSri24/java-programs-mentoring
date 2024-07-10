import java.util.Scanner;

public class StringPrograms {

    public static int countWords(String sentence) {

        // we need to count the number of words

        /*
         * logic:
         * - we want to count words?
         * - how do you know that a word is complete?
         * - when there is a space after the word
         * - when we encounter a space, we know that the previous
         * word has ended
         * - if we count the number of spaces, we can get the
         * number of words
         * - assumptions:
         * - there is exactly one space after every word
         * - there are no extra spaces
         */
        // possibilities:
        /*
         * - there may be spaces at the beginning of the string
         * or at the end
         * - there may be extra spaces in between the words
         * - eg: "hello     world "
         * - to fix this, we should count a space only when
         * the character right before it is a letter
         * - when we use trim(), we remove the space after
         * the last word as well
         * - we can add that extra space after trim
         */

        int count = 0;
        sentence = sentence.trim(); // removed extra from start
        // and end
        sentence = sentence + " ";
        for (int i = 1; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            char prevCh = sentence.charAt(i - 1);
            if (ch == ' ' && prevCh != ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        int count = countWords(s);
        System.out.println("Number of words : " + count);
        sc.close();
    }
}
