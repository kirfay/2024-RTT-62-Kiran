package org.example.Slides_303_6;

import java.util.ArrayList;
import java.util.List;


public class Arraysexample {
    public static void main(String[] args) {

        //can create variable and new array in line too
        //primative numbers initialize to
        double[] dArray = new double[10];

        //this is also a valid way of creating a new array note that
        //it is on 2 lines. First creates the variable, 2nd creates the new array in memory
        int[] iArray;
        iArray = new int[20];

        //this gets used a bit from time to time
        //the complier will see this and create an array of string with size of 3 and puts 3 values
        String[] constants = { "String1", "String2", "String3" };
        for ( String constant : constants ) {
            System.out.println(constant);
        }

        //this is 99% of what you will use in the future
        List<Double> dList = new ArrayList<>();


        // descending
        int[] desc = 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Array.sort(desc);
        System.out.println(Array.toString(desc))

    }
}
