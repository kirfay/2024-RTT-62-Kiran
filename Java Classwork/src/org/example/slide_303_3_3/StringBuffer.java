package org.example.slide_303_3_3;

import static jdk.nashorn.internal.objects.NativeString.replace;

public class StringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello.filename.txt");

        //sb.insert(0, "new_");

        System.out.println(sb);

        ///the thing to memorize for the KBA is  that replace is going to delete first
        //sb, replace(0,4,"very_old_")

    }
}




