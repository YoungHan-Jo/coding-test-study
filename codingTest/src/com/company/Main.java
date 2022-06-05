package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    public int solution(String str) {
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
