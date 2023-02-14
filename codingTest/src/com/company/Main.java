package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, arr);
        System.out.println(answer);
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            answer = Math.max(answer, sum);
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            answer = Math.max(answer, sum);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        answer = Math.max(answer, sum);

        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][n - 1 - i];
        }

        answer = Math.max(answer, sum);

        return answer;
    }
}
