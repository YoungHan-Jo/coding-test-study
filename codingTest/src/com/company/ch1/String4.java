package com.company.ch1;

import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        String4 T = new String4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }
        String[] solution = T.solution(n, arr);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    private String[] solution(int n, String[] arr) {

        for (int i = 0; i < n; ++i) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        return arr;
    }
}
