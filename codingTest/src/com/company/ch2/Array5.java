package com.company.ch2;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Array5 T = new Array5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = T.solution(n);
        System.out.println(answer);
    }

    private int solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                for (int j = i; j < n + 1; j += i) {
                    arr[j] = 1;
                }
                answer++;
            }
        }

        return answer;
    }
}
