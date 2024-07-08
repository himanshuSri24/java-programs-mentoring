class Hello {

    static void printNumbers() {
        // program to print numbers from 1 - n
        int n = 10;
        for(int i = 0; i < n; i ++) {
            System.out.println("The number is : " + i); // cout << " The Number Is : " << n << endl; 
        }
    }

    static void eligibleToVote() {
        int age = 20;
        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }

    public static void main(String[] args) {
        // printNumbers();
        eligibleToVote();
    }
}

// Java uses Unicode: 16-bit character coding system.
// It supports a lot of characters, pretty much every character  you can ever want to use.

// Tokens: Tokens are the smallest individual units of a program.

// 5 types of tokens:
/*
 * reserved keywords ( for, if, else, static, public, private, do, while, int )
 * JAVA has 50 reserved keywords
 * 
 * Identifiers:
 * programmer-designed tokens for naming classes, methods, variables, objects, labels etc.
 * 
 * 
1. They can have alphabets, digits, dollar sign and underscores.
2. They must not begin with digit.
3. Uppercase and lower case letters are distinct.
4. They can be any lengths.
5. Name of all public method starts with lowercase.
6. In case of more than one word starts with uppercase in next word. ( Camel Case )
7. All private and local variables use only lowercase and underscore.
8. All classes and interfaces start with leading uppercases.
9. Constant identifier uses uppercase letters only.

* Literals:
* series of characters that represents a constant value.
1. Integer Literals.
2. Floating-point Literals.
3. Character Literals.
4. String Literals.
5. Boolean Literals.

* Operators:

* Separators:
* () -> method definition, if else, for/while/do-while, equations, type-casting
* {} -> used in functions, in classes etc.
* [] -> to declare array
* ; -> denotes end of line
* , -> to seperate multiple identifiers while declaring, seperate parameters being passed
* . -> to seperate package names from subpackages and classes, to seperate variable / method
        from reference variable (object)
 */


 // Comments in Java:

//  - Single line comments : // something like this
//  - Multi line comments : 
 /*  
  * example
 */

//   - Documentation comment:
  /**
   * this is a documentation comment
   */

   /*
    * Libraries in Java:
    * Language support
    * Utilities
    * Input and output
    * networking
    * Applets
    */

    /*
     * int - 4 bytes - 32 bits - -2^31 - 2^31 - 1
     * long - 8 bytes - 64 bits - -2^63 - 2^63- 1
     * short - 2 bytes - 16 bits - -2^15 - 2^15 - 1 ( -32768 to 32767)
     * byte - 1 byte - 8 bits - -2^7 - 2^7 - 1 (-128 to 127)
     * float - 4 bytes
     * double - 8 bytes
     * boolean - true / false
     * char - abc ( Unicode ) - 2 bytes
     * arrays
     * class
     * interfaces
     * String
     */

/*
 * Type casting:
 * Implicit - happens automatically -> smaller to larger datatype -> int to float, int to long
 * Explicit - we need to specify that we want conversion -> float to int -> int to byte
 * int c;
 * float f = 10.4;
 * c = (int)f;
 */

 /*
  * int arr[10]; [x]
  * datatype arrayName[] = new datatype[size_of_array];
  * int arr[] = new int[10];
  * int arr2[] = {1, 2, 3, 4, 5};
  * String name = "";
  * name = "Himanshu";
  * System.out.println(name);
  */