package com.company.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        P2 T = new P2();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; ++i) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            b[i] = sc.nextInt();
        }

        for (Integer i : T.solution(a, b, m, n)) {
            System.out.print(i + " ");
        }

    }

    private List<Integer> solution(int[] a, int[] b, int m, int n) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;

        while (p1 < m && p2 < n) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }
}
