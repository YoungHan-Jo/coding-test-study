package com.company.ch2;

import java.util.Scanner;

public class A4noArr {

    public static void main(String[] args) {
        A4noArr T = new A4noArr();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.solution(n);
    }

    private void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; ++i) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
