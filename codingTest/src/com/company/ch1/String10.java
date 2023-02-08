package com.company.ch1;


import java.util.Scanner;

public class String10 {

    public static void main(String[] args) {
        String10 T = new String10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        for (int i : T.solution(str, t)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(String str, char t) {
        int[] answer = new int[str.length()];

        int p = 1000;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = Math.min(p, answer[i]);
        }

        return answer;
    }
}
