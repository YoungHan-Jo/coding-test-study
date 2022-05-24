package com.company.ch3;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        P4 T = new P4();
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
        int answer = 0;
        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < n; ++rt) {
            sum += arr[rt];
            if (sum == k) {
                answer++;
            }
            while (sum >= k) {
                sum -= arr[lt++];
                if (sum == k) {
                    answer++;
                }
            }
        }



        return answer;
    }
}
