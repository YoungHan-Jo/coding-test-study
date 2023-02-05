package com.company.ch1;

import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {

        String6 T = new String6();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String answer = T.solution(str);
        System.out.println(answer);
    }

    private String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }


        return answer;
    }
}
