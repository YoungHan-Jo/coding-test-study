package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverse) ? "YES" : "NO";
    }


}
