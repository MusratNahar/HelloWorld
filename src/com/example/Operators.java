package com.example;

public class Operators {
    /* Unary Operator
    Arithmetic Operator
   */
    public static void main(String[] args) {
        //Addition(+)
        int a1 = 30, a2= 50, sum = 0, sub,mult,div;

        // adding a1 and a2
        sum = a1 + a2;
        System.out.println("The sum = " + sum);
        // subtract a1 and a2
        sub= a2 - a1;
        System.out.println("The sub = " + sub);
        // multiply a1 and a2
        mult=a1*a2;
        System.out.println("Multiply = " + mult);
        //.Divison
        div =a2/a1;
        System.out.println("Division = " + div);
        //Unary Operator
        a1=-a1;
        System.out.println("The result = " + a1);

        boolean cond = true;
        int bo1 = 10, bo2 = 1;

        System.out.println("Now cond is: " + cond);
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(bo1  < bo2 ) = " + !(bo1 < bo2 ));
        System.out.println("!(bo1 > bo2 ) = " + !(bo1 > bo2 ));
   //Increment(++)Decrement(--)
        int m=20, n=10;

        System.out.println("Preincrement is= " + ++m);
        System.out.println("Postincrment is= " + m++);
        System.out.println("Predecrement is= " + --n);
        System.out.println("Postdecncrment is= " + n--);
    }
}
