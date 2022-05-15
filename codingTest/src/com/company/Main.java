package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; ++i) {
            b[i] = sc.nextInt();
        }

        T.solution(a, b, n, m);
    }

    private List<Integer> solution(int[] a, int[] b, int n, int m) {
        List<Integer> answer = new ArrayList<>();

        


        return answer;
    }

}
