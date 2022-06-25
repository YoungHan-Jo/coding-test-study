package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; ++i) {
            arr[i] = sc.nextInt();
        }
        List<Integer> solution = T.solution(k, arr);
        for (Integer i : solution) {
            System.out.print(i + " ");
        }

    }

    private List<Integer> solution(int k, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < k; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        return answer;
    }


}
