package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(m, k, arr));

    }

    private int solution(int m, int k, int[] arr) {
        int answer;
        int sum = 0;

        for (int i = 0; i < k; ++i) {
            sum += arr[i];
        }

        answer = sum;

        for (int i = k; i < m; ++i) {
            sum += arr[i];
            sum -= arr[i-k];

            answer = Math.max(answer, sum);
        }


        return answer;
    }

}
