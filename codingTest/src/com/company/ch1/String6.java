package com.company.ch1;

import java.util.Scanner;

public class String6 {

    public static void main(String[] args) {
        String6 T = new String6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String solution = T.solution(str);
        System.out.println(solution);
    }

    private String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    // 풀이 2
    private String solution(char[] c) {
        String answer = "";

        for (int i = 0; i < c.length; i++) {
            if (answer.indexOf(c[i]) == -1) {
                answer += c[i];
            }
        }

        return answer;
    }

}
