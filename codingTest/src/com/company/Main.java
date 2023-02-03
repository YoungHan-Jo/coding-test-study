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

        String answer = "";
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }


}
