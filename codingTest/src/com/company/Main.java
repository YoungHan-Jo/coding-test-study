package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().toCharArray()[0];
        int[] solution = T.solution(str, c);
        for (int i : solution) {
            System.out.print(i + " ");
        }

    }

    private int[] solution(String str, char c) {
        int[] answer = new int[str.length()];

        char[] chars = str.toCharArray();

        int len = 100;

        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == c) {
                len = 0;
            }else{
                len++;
            }
            answer[i] = len;
        }

        len = 100;

        for (int i = chars.length - 1; i >= 0; --i) {
            if (chars[i] == c) {
                len = 0;
            } else {
                len++;
            }
            answer[i] = Math.min(answer[i], len);
        }

        return answer;
    }


}
