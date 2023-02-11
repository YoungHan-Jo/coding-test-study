package com.company.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Array6 T = new Array6();
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

        for (String str : arr) {
            int num = getReverseNum(str);

            if (isPrime(num)) {
                answer.add(num);
            }
        }

        return answer;
    }

    private int getReverseNum(String str) {
        String strReverse = new StringBuilder(str).reverse().toString();
        int num = Integer.parseInt(strReverse);
        return num;
    }

    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
