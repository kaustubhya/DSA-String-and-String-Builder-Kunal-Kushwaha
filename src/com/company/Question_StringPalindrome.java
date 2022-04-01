package com.company;

public class Question_StringPalindrome {
    public static void main(String[] args) {

        String str = "abcdcba";
        boolean ans = isPalindrome(str);
        System.out.println(ans);

    }


    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0){
//            keep null first here and it could return either true or false. It's up to you
            return true;
        }
        str.toLowerCase();

        for(int i = 0; i <=  str.length()/ 2; i++){
//            Notice the parenthesis after str.length because String is a class and .length is
//            a method, though it may perform the same function as arrays
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }

        return true;
    }
}
