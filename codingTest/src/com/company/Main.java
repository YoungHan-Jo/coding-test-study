package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        int[] solution = T.solution(str, c);
        for (int i : solution) {
            System.out.print(String.valueOf(i) + " ");
        }
    }

    private int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        char[] s = str.toCharArray();
        int p = 1000;
        for (int i = 0; i < str.length(); ++i) {
            if (s[i] == c) {
                answer[i] = (p = 0);
            } else {
                answer[i] = ++p;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; --i) {
            if (s[i] == c) {
                answer[i] = (p = 0);
            } else {
                if (answer[i] > ++p) {
                    answer[i] = p;
                }
            }
        }
        return answer;
    }

}
