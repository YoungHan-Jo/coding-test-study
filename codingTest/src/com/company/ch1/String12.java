package com.company.ch1;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        String12 T = new String12();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        String answer = T.solution(t, str);
        System.out.println(answer);
    }

    private String solution(int t, String str) {
        String answer = "";

        for (int i = 0; i < t; i++) {

            String tmp = str.substring(0, 7).replace("*", "0").replace("#", "1");

            int num = Integer.parseInt(tmp, 2);

            answer += (char) num;


            str = str.substring(7);
        }


        return answer;
    }
}
