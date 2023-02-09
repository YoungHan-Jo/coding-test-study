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

        int answer = T.solution(arr);
        System.out.println(answer);

    }

    private int solution(List<Integer> arr) {
        int answer = 0;

        int t = 0;

        for (Integer i : arr) {
            if (i > t) {
                answer++;
                t = i;
            }
        }

        return answer;
    }

}
