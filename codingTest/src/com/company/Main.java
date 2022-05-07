package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;
        int high = 0;

        for (int i = 0; i < n; ++i) { // i 학생 번호
            int[] same = new int[n];

            for (int j = 0; j < 5; ++j) { // j 학년

                for (int k = 0; k < n; ++k) { // k 비교하는 학생
                    if (arr[i][j] == arr[k][j]) {
                        same[k] = 1;
                    }
                }
            }

            int sum = sum(same);
            if (sum > high) {
                answer = i + 1;
                high = sum;
            }
        }



        return answer;
    }

    private int sum(int[] same) {
        int sum = 0;
        for (int i = 0; i < same.length; ++i) {
            sum += same[i];
        }
        return sum;
    }


}
