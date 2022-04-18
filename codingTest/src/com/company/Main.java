package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String cnt = sc.nextLine();
        String str = sc.nextLine();
        System.out.println(T.solution(Integer.valueOf(cnt), str));
    }

    private String solution(int cnt, String str) {
        String answer = "";

        for (int i = 0; i < cnt; ++i) {
            int sum = 0;
            String sign = str.substring(i * 7, i * 7 + 7);
            String binary = new StringBuilder(sign).reverse().toString();
            for (int j = 0; j < binary.length() ; ++j) {
                if (binary.charAt(j) == '#') {
                    int pow = (int) Math.pow(2, j);
                    sum += pow;
                }
            }
            answer += (char) sum;
        }
        return answer;
    }
}
