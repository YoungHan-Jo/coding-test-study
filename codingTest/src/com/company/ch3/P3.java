package com.company.ch3;

import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        P3 T = new P3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }

    private int solution(int n, int k, int[] arr) {


        int sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += arr[i];
        }

        int answer = sum;

        for (int i = k; i < n; ++i) {
            sum += arr[i];
            sum -= arr[i - k];

            if (sum > answer) {
                answer = sum;
            }
        }


        return answer;
    }
}
