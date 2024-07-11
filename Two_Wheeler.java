import java.util.Scanner;

public class Two_Wheeler {

    String model_ID;
    String model_name;
    String brand_name;
    int model_price;

    Scanner sc = new Scanner(System.in);

    Two_Wheeler() {
        System.out.println("Enter Model ID : ");
        model_ID = sc.nextLine();
        System.out.println("Enter model Name : ");
        model_name = sc.next();
        System.out.println("Enter Brand Name : ");
        brand_name = sc.next();
        System.out.println("Enter Model Price : ");
        model_price = sc.nextInt();
    }

    Two_Wheeler(String model_ID, String model_name, String brand_name, int model_price) {
        setTwoWheelerDetails(model_ID, model_name, brand_name, model_price);
    }

    void setTwoWheelerDetails(String model_ID, String model_name, String brand_name, int model_price) {
        this.model_ID = model_ID;
        this.model_name = model_name;
        this.brand_name = brand_name;
        this.model_price = model_price;
    }

    void printTwoWheelerDetails() {
        System.out.println("The two wheeler details are : ");
        System.out.println("Model ID : " + model_ID);
        System.out.println("Model Name : " + model_name);
        System.out.println("Brand Name : " + brand_name);
        System.out.println("Model Price : " + model_price);
        System.out.println();
    }

    static void sortTwoWheelerDetails(Two_Wheeler arr[]) {
        // sort using the model name in ascending order means alphabetical order

        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // to compare two strings -> str1.compareTo(str2) -> equal = 0, first is less ->
                // -ve , else +ve
                if (arr[j].model_name.compareTo(arr[j + 1].model_name) > 0) {
                    Two_Wheeler temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // display
        for (int i = 0; i < arr.length; i++) {
            arr[i].printTwoWheelerDetails();
        }

    }

    public static void main(String[] args) {
        Two_Wheeler arr[] = new Two_Wheeler[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Two_Wheeler();
        }

        sortTwoWheelerDetails(arr);
    }
}

/*
 * Create an array of Two_Wheeler Objects. Consider the following data members
 * for the Two_Wheeler Object:
 * 
 * Two_Wheeler Model ID - String
 * Two_Wheeler Model Name - String
 * Two_Wheeler Brand Name - String
 * Two_Wheeler Model Price - Integer
 * Methods:
 * SetTwo_WheelerDetails - Sets the values for the Two_Wheeler Object
 * PrintTwo_WheelerDetails - Prints the Values for the Two_Wheeler Object
 * Static Method - Sort Two_Wheeler Details - The Method receives an array of
 * Two_Wheeler Objects and sorts them based on the Two_Wheeler Model Name in the
 * ascending order and displays the details of all the Two_Wheeler Objects to
 * the User
 */