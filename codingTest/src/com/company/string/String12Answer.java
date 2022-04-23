package com.company.string;

import java.util.Scanner;

public class String12Answer {

    public static void main(String[] args) {
        String12Answer T = new String12Answer();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }

    private String solution(int n, String str) {
        String answer = "";
        for (int i = 0; i < n; ++i) {
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.valueOf(tmp, 2);
            answer += (char) num;

            str = str.substring(7);
        }

        return answer;
    }
}
