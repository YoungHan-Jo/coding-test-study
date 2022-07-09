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
        System.out.println(T.solution(n,arr));
    }

    private int solution(int n, int[] arr) {
        int count = 0;
        int highest = Integer.MIN_VALUE;
        for (int height : arr) {
            if (height > highest) {
                count++;
                highest = height;
            }
        }
        return count;
    }
}
