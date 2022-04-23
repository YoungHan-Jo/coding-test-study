package com.company.string;

import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {
        String8 T = new String8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));

    }

    private String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse) ? "YES" : "NO";
    }
}
