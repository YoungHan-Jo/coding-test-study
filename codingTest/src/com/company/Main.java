package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (Integer i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);

        for (int i = 2; i < n; ++i) {
            answer.add(answer.get(i-2) + answer.get(i-1));
        }

        return answer;
    }

}
