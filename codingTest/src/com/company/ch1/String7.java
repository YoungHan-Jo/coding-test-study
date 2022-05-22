package com.company.ch1;

import java.util.Scanner;

public class String7 {

    public static void main(String[] args) {
        String7 T = new String7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse) ? "YES" : "NO";
    }
}
