package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = T.solution(n, arr);

        System.out.println(answer);

    }

    private int solution(int n, int[][] arr) {
        int answer = 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = 0;
            for (int j = 0; j < n; j++) {

                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        sum++;
                        break;
                    }
                }
            }
            if (max < sum) {
                max = sum;
                answer = i + 1;
            }
        }

        return answer;
    }

}
