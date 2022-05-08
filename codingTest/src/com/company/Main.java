package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }

    private int solution(int n, int m, int[][] arr) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            for (int k = i+1; k < n; ++k) {
                map.put(arr[0][i] + "," + arr[0][k], 0);
            }
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = j+1; k < n; ++k) {

                    if (map.containsKey(arr[i][j] + "," + arr[i][k])) {
                        map.replace(arr[i][j] + "," + arr[i][k], map.get(arr[i][j] + "," + arr[i][k])+1);
                    }
                }
            }
        }

        for (Integer v : map.values()) {
            if (v == m-1) {
                answer++;
            }
        }

        return answer;
    }

}
