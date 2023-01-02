package com.example;

public class Opertors2 {
/*  Relational Operator
    Logical Operator
    Ternary Operator
    Assignment Operator*/


    public static void main(String[] args)
    {
        //‘Equal to’ operator (==)
        int a1 = 5, a2 = 10, a3 = 5;
        System.out.println("a1 == a2: " + (a1 == a2));
        System.out.println("a1 == a3: " + (a1 == a3));
       //‘NOt Equal to’ operator (==)

        System.out.println("a1 == a2: " + (a1 != a2));
        System.out.println("a1 == a3: " + (a1 !=a3));

        //‘Greater than’,less than operator(><)
        System.out.println("a1 > a2: " + (a1 > a2));
        System.out.println("a1 < a3: " + (a1 <= a3));
         // Logical ‘AND’ Operator (&&)
        int d=0;
        if ((a1 < a2) && (a1 == a3)) {
            d = a1 + a2 + a3;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");

        // using logical OR to verify
        int a = 10, b = 1, c = 10, e = 30;


        if (a > b || c == e)
            System.out.println("First block will be executed");
        else
            System.out.println("2nd block will be executed");

       // logical NOT operator
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));

    }

    }

