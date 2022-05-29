package com.company.ch3;

import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        P5 T = new P5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0;

        int lt = 1;
        int sum = lt;

        for (int rt = 2; rt <= n / 2 + 1; rt++) {
            sum += rt;
            if (sum == n) answer ++;
            while (sum >= n && lt < rt) {
                sum -= lt++;
                if(sum == n) answer++;
            }

        }


        return answer;
    }
}
