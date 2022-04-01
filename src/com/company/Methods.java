package com.company;

import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("         Kunal          ".strip());
        // strip removes all the spaces from a string that are present before it's start
        System.out.println(Arrays.toString(name.split(" ")));
        // this splits the array into the places which are separated by spaces

    }
}
