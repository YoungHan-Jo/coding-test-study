package com.company.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {
        A1 T = new A1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = T.solution(n, arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; ++i) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
