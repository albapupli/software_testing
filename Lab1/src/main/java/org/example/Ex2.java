package org.example;

public class Ex2 {
    public static void main(String[] args) {
        String str1 = "Software";
        String str2 = "Tetsing";
        String str3 = "App";

        String stringConcated1 = str1 + str2 + str3;
        String stringconcated2 = str1.concat(str2).concat(str3);
        System.out.println(stringConcated1);
        System.out.println(stringconcated2);
    }
}
