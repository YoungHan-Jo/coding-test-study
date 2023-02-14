package com.company.ch2;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Array10 T = new Array10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n + 2][n + 2];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, arr);
        System.out.println(answer);

    }

    private int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                boolean isTop=true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]) {
                        isTop = false;
                    }
                }
                if (isTop) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
