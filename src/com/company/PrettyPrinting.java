package com.company;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 125.1284356789f;
        System.out.printf("The formatted number is: %.2f", a);

        // Check out here we used printf for formatted text
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s","Kaustubhya", "OP");
        System.out.println();

        System.out.printf("The value of pi is: %.3f", Math.PI);
        System.out.println();

    }
}
