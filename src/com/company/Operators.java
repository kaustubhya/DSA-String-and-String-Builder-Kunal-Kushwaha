package com.company;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);

        //this is same after a few steps :  "a" + "1"
//        integer (int) will be converted to Integer (rapper class) that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(54));
        String ans = new Integer(54) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
