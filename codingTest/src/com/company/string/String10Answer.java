package com.company.string;

import java.util.Scanner;

public class String10Answer {

    public static void main(String[] args) {
        String10Answer T = new String10Answer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int i : T.solution(str, c)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(String str, char t) {
        int[] answer = new int[str.length()];

        int p = 1000;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == t) {
                answer[i] = (p = 0);
            } else {
                answer[i] = ++p;
            }
        }

        p = 1000;

        for (int i = str.length() - 1; i >= 0; --i) {
            if (str.charAt(i) == t) {
                if (answer[i] > (p = 0)) {
                    answer[i] = p;
                }
            } else {

                if (answer[i] > ++p) {
                    answer[i] = p;
                }
            }
        }

        return answer;
    }
}
