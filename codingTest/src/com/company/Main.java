package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[][] arr) {
        int answer = 0;

        int[][] chart = new int[n][5];

        for (int i = )



        return answer;
    }

}
