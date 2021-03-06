package com.company.ch1;

import java.util.Scanner;

public class String9 {

    public static void main(String[] args) {
        String9 T = new String9();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    private int solution(String str) {
        int answer = 0;

        for (char c : str.toCharArray()) {
            if(c >= 48 && c <= 57) answer = answer * 10 + (c - 48);
        }

        return answer;
    }

    public int solution2(String str) {
        String answer = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; ++i) {
            if (Character.isDigit(chars[i])) {
                answer += chars[i];
            }
        }
        return Integer.valueOf(answer);
    }

}
