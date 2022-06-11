package com.company.ch1;

import java.util.Scanner;

public class String11Answer {

    public static void main(String[] args) {
        String11Answer T = new String11Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        str = str + ' ';
        int count = 1;


        for (int i = 0; i < str.length()-1; ++i) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += String.valueOf(count);
                    count = 1;
                }
            }
        }

        return answer;
    }

    private String solution2(String str) {
        str += ' ';
        char[] c = str.toCharArray();
        String answer = String.valueOf(c[0]);
        int cnt = 1;
        for (int i = 1; i < c.length; ++i) {
            if (c[i] == c[i - 1]) {
                cnt++;
            } else {
                if (cnt > 1) {
                    answer += cnt;
                }
                answer += String.valueOf(c[i]);
                cnt = 1;
            }
        }
        return answer;
    }
}
