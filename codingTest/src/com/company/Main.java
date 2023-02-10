package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> answer = T.solution(n);
        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                answer.add(1);
                continue;
            }
            answer.add(answer.get(i - 2) + answer.get(i - 1));
        }
        return answer;
    }
}
