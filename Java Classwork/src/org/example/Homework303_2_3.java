package org.example;

public class Homework303_2_3 {
    public static void main(String[] args){
        //Write a program that declares an integer a variable x, assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        // Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
        //Perform the preceding exercise with the following values:
        //9
        //17
        //88
        int x = 2;
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));
        x <<= 1;
        //predicted decimal value 4
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary representation of x after left shift: " + Integer.toBinaryString(x));

        //for value 9//
        int x = 9;
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));
        x <<= 1;
        //predcit 18
        //predict 10010
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary representation of x after left shift: " + Integer.toBinaryString(x));

        //for value 17
        int x = 17;
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));
        x <<= 1;
        //decimal value 34
        //after left shift 10010
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary representation of x after left shift: " + Integer.toBinaryString(x));

        //for value 88
        int x = 88;
        System.out.println("Binary representation of x: " + Integer.toBinaryString(x));
        x <<= 1;
        //predicted decimal 176
        //predicted binary 1011000
        System.out.println("Decimal value of x: " + x);
        System.out.println("Binary representation of x after left shift: " + Integer.toBinaryString(x));
    }
}
