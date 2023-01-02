package com.example;

public class Operators3 {
    public static void main(String[] args) {
   // Ternary Operator
   int n1 = 5, n2 = 10, res;

        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        res = (n1 > n2) ? (n1 + n2) : (n1 - n2);

        System.out.println("Result = " + res);


   // Assignment Operator
        System.out.println("num is assigned: " + n1);

        //Adding & Assigning values
        n1 += n2;

        // Displaying the assigned values
        System.out.println("num1 = " + n1);

        //Subtracting & Assigning values
        n1 -= n2;

        // Displaying the assigned values
        System.out.println("num1 = " + n1);


        //Mutiplying & Assigning values
        n1 *= n2;

        // Displaying the assigned values
        System.out.println("num1 = " + n1);

        //Dividing & Assigning values
        n1 /= n2;

        // Displaying the assigned values
        System.out.println("num1 = " + n1);
        //Moduling & Assigning values

        n1 %= n2;

        // Displaying the assigned values
        System.out.println("num1 = " + n1);

}
}