package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        List<Integer> answer = T.solution(arr);
        for (Integer i : answer) {
            System.out.print(i + " ");
        }

    }

    private List<Integer> solution(List<String> arr) {
        List<Integer> answer = new ArrayList<>();

        for (String s : arr) {
            int num = getReverseNum(s);

            if (isPrime(num)) {
                answer.add(num);
            }
        }
        return answer;
    }

    private boolean isPrime(int num) {
        int cnt = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                cnt++;
            }
        }
        return cnt == 1;
    }

    private int getReverseNum(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        int num = Integer.parseInt(reverse);
        return num;
    }
}
