package com.company.ch1;

import java.util.Scanner;

public class String8 {

    public static void main(String[] args) {
        String8 T = new String8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String answer = T.solution(str);
        System.out.println(answer);
    }

    private String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)) {
            answer = "YES";
        }


        return answer;
    }
}
