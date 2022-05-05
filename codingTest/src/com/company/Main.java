package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += 2;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));

    }

    private int solution(int n, int[][] arr) {
        int[] dx = {-1,0,1,0};
        int[] dy = {0, 1, 0, -1};
        int answer = 0;

        for (int i = 1; i < n-1; ++i) {
            for (int j = 1; j < n-1; ++j) {
                boolean flag = true;
                for (int k = 0; k < 4; ++k) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }

}
