package com.company.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        A6 T = new A6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            strList.add(sc.next());
        }
        for (Integer i : T.solution(strList)) {
            System.out.print(i + " ");
        }

    }

    private List<Integer> solution(List<String> strList) {
        List<Integer> answer = new ArrayList<>();

        for (String str : strList) {
            Integer num = Integer.valueOf(new StringBuilder(str).reverse().toString());

            if(isPrime(num)) answer.add(num);
        }

        return answer;
    }

    private boolean isPrime(Integer num) {
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2 ? true : false;
    }
}
