package com.company.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        A8 T = new A8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (Integer i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int rank = 1;
            for (int j = 0; j < n; ++j) {
                if (arr[j] > arr[i]) {
                    rank++;
                }
            }
            answer.add(rank);
        }


        return answer;
    }
}
