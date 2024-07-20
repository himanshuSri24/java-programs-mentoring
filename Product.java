/*
 * E-commerce Product Catalog
Problem Statement:
Create a class Product with data members productID, productName, price, and stockQuantity. Create a subclass Electronic with additional data members warrantyPeriod, and powerUsage that inherits Product.

a. Override the method displayDetails() to include electronic-specific details.
b. Create a static method sortProductsByName(Product[] products) that sorts and displays products alphabetically by name.

 */

import java.util.Scanner;

class Product {

    int productID;
    String productName;
    int price;
    int stockQuantity;

    Product(int productID, String productName, int price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    void display() {
        System.out.println("Product ID : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
        System.out.println("Stock Quantity : " + stockQuantity);
    }
}

class Electronic extends Product {

    int warrantyPeriod;
    int powerUsage;

    public Electronic(int productID, String productName, int price, int stockQuantity, int warrantyPeriod,
            int powerUsage) {
        super(productID, productName, price, stockQuantity);
        this.warrantyPeriod = warrantyPeriod;
        this.powerUsage = powerUsage;

    }

    void display() {
        super.display();
        System.out.println("Warranty Period : " + warrantyPeriod);
        System.out.println("Power Usage : " + powerUsage);
    }

    static void sortProductsByName(Product electronicProducts[]) {
        for (int i = 0; i < electronicProducts.length; i++) {
            for (int j = 0; j < electronicProducts.length - 1 - i; j++) {
                if (electronicProducts[j].productName.compareTo(electronicProducts[j + 1].productName) > 0) {
                    Product temp = electronicProducts[j];
                    electronicProducts[j] = electronicProducts[j + 1];
                    electronicProducts[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfElectronicProducts = 3;
        // creating an array of type Product, I have not created any objects yet.
        Product electronicProducts[] = new Product[numberOfElectronicProducts];

        // datatype arrName[] = new datatype[sizeOfArary] -> we use Square brackets
        // after variable name / datatype

        // datatype[] arrName = new datatype[sizeOfArary] -> we use Square brackets
        // after variable name / datatype

        // classname objName = new ClassName(parameters ( optional )) // no square
        // brackets, we use round brackets

        // THIS CREATES AN ARRAY OF TYPE PRODUCT
        // EACH ELEMENT IS A REFERENCE VARIABLE OF PRODUCT
        // WE DID NOT CREATE ANY OBJECT SO FAR BECAUSE WE DID NOT CALL CONSTRUCTOR

        // we have to call constructor for each element -> to create objects
        // left side classname is for reference variable, right side classname is for
        // creating object
        // ClassName objName = new ClassName();

        // Product electronicProducts[] = new Product[numberOfElectronicProducts];
        // electronicProducts[i] = new Electronic(a, b, c, d, e, f);

        for (int i = 0; i < electronicProducts.length; i++) {
            int a;
            String b;
            int c;
            int d;
            int e;
            int f;
            System.out.println("Enter product ID : ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter product name : ");
            b = sc.nextLine();
            System.out.println("Enter product price : ");
            c = sc.nextInt();
            System.out.println("Enter stock quantity : ");
            d = sc.nextInt();
            System.out.println("Enter product warranty period : ");
            e = sc.nextInt();
            System.out.println("Enter power usage : ");
            f = sc.nextInt();
            electronicProducts[i] = new Electronic(a, b, c, d, e, f);
        }

        // original array values display
        System.out.println("Original Array : ");
        for (int i = 0; i < electronicProducts.length; i++) {
            electronicProducts[i].display();
        }

        sortProductsByName(electronicProducts);

        // display sorted array values
        System.out.println("Sorted Array : ");
        for (int i = 0; i < electronicProducts.length; i++) {
            electronicProducts[i].display();
        }

        sc.close();
    }
}