package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));

    }

    private int solution(int n, int[] arr) {
        int answer = 0;
        int point = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                point = 0;
                continue;
            }
            answer += ++point;
        }

        return answer;
    }

}
