package com.company.ch1;

import java.util.Scanner;

public class String11 {
    public static void main(String[] args) {
        String11 T = new String11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = T.solution(str);
        System.out.println(answer);
    }

    private String solution(String str) {
        String answer = "";

        str += " ";
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += cnt;
                }
                cnt = 1;
            }
        }

        return answer;
    }
}
