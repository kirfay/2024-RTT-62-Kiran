package org.example.Slides_303_6;

public class ArrayDelete {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        //pos 01234
        // value 12345

        //pos 01234
        // vlaue 1245
        int deletedPosition = 3;
        if ( deletedPosition < 0 || deletedPosition > array.length ) {
            System.out.println("Position to deleted is invalid") ;
        }

        //now lets delete item at position 4

        // 1) create a new array with - 1
        int[] deleted = new int[array.length - 1];

        // 2) copy the first elements upto but not including the deleted postion
        for ( int pos = 0 ; pos < 4 ; pos++ ) {
            deleted[pos] = array[pos];
        }
        // 3) copy the last elements into a pos-1 in the new array
        for (int pos = deletedPosition + 1; pos < array.length; pos++) {
            deleted[pos - 1] = array[pos];
        }

        for ( int value ; deleted ) {
            System.out.println(value);
        }
    }
}
