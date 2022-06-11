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
