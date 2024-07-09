import java.util.Scanner;
import java.util.Arrays;

public class StandardPrograms {

    void isPrime(int num) {
        for(int i = 2; i * i <= num; i ++) {
            if(num % i == 0) {
                System.out.println("The number is not a prime number");
                return;
            }
        }
        System.out.println("The number is a prime number");
    }

    int takeIntegerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    void stringFunctions() {
        // swapping two strings
        // String str1 = "Hello", str2, temp;
        // str2 = "Koushik";
        // System.out.println("Before swapping");
        // System.out.println(str1);
        // System.out.println(str2);
        // temp = str1;
        // str1 = str2;
        // str2 = temp;
        // System.out.println("After swapping");
        // System.out.println(str1);
        // System.out.println(str2);
        Scanner sc = new Scanner(System.in);
        String str = "Today is Tuesday and this is just a random sentence cause why not?";
        // String str;
        // System.out.println("Enter a string : ");
        // str = sc.nextLine();
        // find length of string ( total number of characters -> string_name.length())
        int length = str.length();
        System.out.println("Length of the string is : " + length);
        // if I want to get the character at a given index ( string_name.charAt(i))
        // if I want to print the 4th character  (index : 3)
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        // if I want a substring from the string ( string_name.substring(start_index, end_index))
        // I want the characters at index [5, 10)
        String a = str.substring(5, 10);
        System.out.println(a);
        // if I want a substring from the string ( string_name.substring(start_index))   
        System.out.println(str.substring(5));     
        // if I want to search for something in the string ( string_name.indexOf(string_to_find))
        // I want to check if "why" is present in the string
        System.out.println(str.indexOf("Koushik"));
        // if I want to compare two strings to check if they're equal ( string_1.equals(string_2))
        String str1 = "ThIS is a wEiRDly wRITTen StrINg", str2 = "Abc";
        System.out.println("Is str1 equal to str2 ? " + str1.equals(str2));
        // if I want to compare two strings to check if they're equal but ignore the case ( string_1.equalsIgnoreCase(string_2))
        System.out.println("Is str1 equal to str2 ? " + str1.equals(str2));
        // if I want to compare 2 strings in alphabetical order ( str1.compareTo(str2))
        System.out.println("Str1 compare to str2 : " + str1.compareTo(str2));
        // if I want to compare 2 strings in alphabetical order ignore case ( str1.compareToIgnoreCase(str2))
        System.out.println("Str1 compare to str2 : " + str1.compareToIgnoreCase(str2));
        // if I want to convert string to lower case ( string_name.toLowerCase())  
        System.out.println(str1.toLowerCase());
        // if I want to convert string to upper case ( string_name.toUpperCase())
        System.out.println(str1.toUpperCase());
        // if I want to remove all leading and trailing spaces ( string_name.trim() )
        String weirdString = "       This is a sentence             ";
        System.out.println(weirdString);
        System.out.println(weirdString.length());
        weirdString = weirdString.trim();
        System.out.println(weirdString);
        System.out.println(weirdString.length());
        // if I want to replace one character with another ( string_name.replace(oldChar, newChar) )
        String anotherString = "This is a good day";
        System.out.println(anotherString.replace("good", "great"));
        System.out.println(anotherString);
        // if I want to check if a string contains another string ( string_name.contains(str2) )
        System.out.println(anotherString.contains("good"));

        // if I want to convert the entire string to a character array ( string_name.toCharArray() )
        char arr[] = anotherString.toCharArray();
        System.out.println(Arrays.toString(arr));
        // if I want to check if the string starts with a given value ( string_name.startsWith(str2) )
        System.out.println(anotherString.startsWith("This was"));
        // if I want to check if the string ends with a given value ( string_name.endsWith(str2) )
        System.out.println(anotherString.endsWith("night"));
    }

    public static void main(String[] args) {
        StandardPrograms obj = new StandardPrograms();    
        // int num = obj.takeIntegerInput();
        // obj.isPrime(num);
        obj.stringFunctions();
    }
}

// 1. program to find if a given number is prime