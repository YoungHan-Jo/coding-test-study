package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(T.solution(n));
    }

    private int solution(int n) {
        int answer = 0;
        int lt = 1;
        int sum = 1;
        int m = n / 2 + 1;

        for (int rt = 2; rt <= m; ++rt) {
            sum += rt;
            if(sum == n) answer++;
            while (sum >= n && lt < rt) {
                sum -= lt++;
                if (sum == n) answer++;
            }

        }


        return answer;
    }
}
