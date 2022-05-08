package com.company.array;

import java.util.Scanner;

public class A12Star {
    public static void main(String[] args) {
        A12Star T = new A12Star();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(m,n,arr));
    }

    private int solution(int m, int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; ++i) { // 멘토 학생 번호
            for (int j = 1; j <= n; ++j) { // 멘티 학생 번호
                int count = 0;
                for (int k = 0; k < m; ++k) { // 문제 번호
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; ++s) { // 문제 당 순위
                        if(arr[k][s]==i) pi = s;
                        if(arr[k][s]==j) pj = s;
                    }
                    if(pi < pj) count++;
                }
                if (count == m) answer++;
            }
        }


        return answer;
    }
}
