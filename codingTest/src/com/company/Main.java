package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            stringList.add(sc.next());
        }
        for (Integer i : T.solution(stringList)) {
            System.out.print(i + " ");
        }

    }

    private List<Integer> solution(List<String> stringList) {
        List<Integer> answer = new ArrayList<>();

        for (String str : stringList) {
            int reverseInt = Integer.valueOf(new StringBuilder(str).reverse().toString());

            if (isPrime(reverseInt)) answer.add(reverseInt);
        }

        return answer;
    }

    private boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count == 2? true: false;
    }

}
