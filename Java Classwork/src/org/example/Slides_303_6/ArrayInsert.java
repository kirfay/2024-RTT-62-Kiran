package org.example.Slides_303_6;

public class ArrayInsert {

    public static void main(String[] args ) {

        int[] array = { 1, 2, 3, 4, 5};

        //pos 01234
        // value 12345

        //array after inserting
        //pos 012345
        // value 129345


        //lets write some code to insert an element into the array at position 2
        // 1) create a new array of size + 1


        int[] insert = new int[array.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
        for ( int pos = 0 ; pos < 2 ; pos++ ) {
            insert[pos] = array[pos];
        }

        // 3) actually insert the value we want in position 2
        insert[2] = 9;

        // 4) copy over the rest of the array
        for ( int post = 2 ; pos < array.length ; pos++ ) {
            insert[pos + 1] = array[pos];
        }

        for ( int value : insert ) {
            System.out.println(vlaue);
        }


    }
}
