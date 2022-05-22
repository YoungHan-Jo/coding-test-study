package com.company.ch2;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        A4 T = new A4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; ++i) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
