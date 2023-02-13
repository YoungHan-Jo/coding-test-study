package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> answer = T.solution(arr);
        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(List<Integer> arr) {
        List<Integer> answer = new ArrayList<>();

        for (Integer x : arr) {
            int rank = 1;
            for (Integer y : arr) {
                if (x < y) {
                    rank++;
                }
            }
            answer.add(rank);
        }

        return answer;
    }
}
