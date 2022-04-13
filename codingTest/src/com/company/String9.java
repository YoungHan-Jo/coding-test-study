package com.company;

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
}
