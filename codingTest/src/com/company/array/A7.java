package com.company.array;

import java.util.Scanner;

public class A7 {

    public static void main(String[] args) {
        A7 T = new A7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[] arr) {
        int answer = 0;

        int num = 0;

        for (int i : arr) {
            if (i == 0) {
                num = 0;
                continue;
            }
            answer += ++num;
        }

        return answer;
    }
}
