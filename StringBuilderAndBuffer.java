public class StringBuilderAndBuffer {
    static void p1String() {
        String s = "koushik is a good boy";
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = w.charAt(i);
            char upperCaseCharacter = Character.toUpperCase(ch);
            if (i % 2 == 0) {
                w += upperCaseCharacter;
            } else {
                w += ch;
            }
        }
        System.out.println(w);
    }

    static void p1() {
        StringBuffer w = new StringBuffer("koushik is a good boy");
        for (int i = 0; i < w.length(); i++) {
            if (i % 2 == 0) {
                char ch = w.charAt(i);
                char upperCaseCharacter = Character.toUpperCase(ch);
                w.setCharAt(i, upperCaseCharacter);
            }
        }
        System.out.println(w);
    }

    // print all odd length words in a string
    // Koushik is a very good boy
    // split the sentence into words
    // for each word, count
    static void p2String() {
        String s = "Koushik    is   a very good boy";
        s = s.trim() + " ";
        // how to divide this into words?
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0) {
                w += ch;
                continue;
            }
            if (ch == ' ' && s.charAt(i - 1) != ' ') {
                if (w.length() % 2 == 1) {
                    System.out.println(w);
                }
                w = "";
            } else if (ch != ' ') {
                w += ch;
            }
        }
    }

    static void p2String2() {
        String s = "Koushik    is   a very good boy";
        s = s.trim() + " ";
        // how to divide this into words?
        String words[] = s.split("\s+");
        for (String word : words) {
            if (word.length() % 2 == 1)
                System.out.println(word);
        }
    }

    static void p2() {
        String s = "Koushik    is   a very good boy";
        s = s.trim() + " ";
        StringBuffer w = new StringBuffer("");
        // how to divide this into words?
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0) {
                w.append(ch);
                continue;
            }
            if (ch == ' ' && s.charAt(i - 1) != ' ') {
                if (w.length() % 2 == 1) {
                    System.out.println(w);
                }
                w = new StringBuffer("");
            } else if (ch != ' ') {
                w.append(ch);
            }
        }
    }

    static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    static void p3() {
        String s = "ram is good";
        String words[] = s.split("\s+");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            reversedString += reverse(words[i]) + " ";
        }
        System.out.println(reversedString);
    }

    static void p3Version2() {
        String s = "ram is    good";
        s = s.trim() + " ";
        String reversedString = "";
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' && s.charAt(i - 1) != ' ') {
                reversedString += reverse(w) + " ";
                w = "";
            } else if (ch != ' ') {
                w += ch;
            } else if (ch == ' ') {
                reversedString += ch;
            }
        }
        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        // p1String();
        // p1();
        // p2String2();
        // p2();
        // p3();
        p3Version2();
    }
}

// index : 0 1 2 3 4 5
// position: 1 2 3 4 5 6

/*
 * Stringbuilder is mainly used for single thread applications
 * Stringbuffer is also for multi-threaded applications
 * multi threading go to - stringbuffer
 */