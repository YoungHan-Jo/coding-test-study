package com.company.array;

import java.util.Scanner;

public class A11Star {
    public static void main(String[] args) {
        A11Star T = new A11Star();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j < 6; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; ++i) {
            int count = 0;
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= 5; ++k) {
                    if (arr[i][k] == arr[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max) {
                max=count;
                answer = i;
            }
        }
        return answer;
    }
}
