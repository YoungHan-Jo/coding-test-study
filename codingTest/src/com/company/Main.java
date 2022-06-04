package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
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
