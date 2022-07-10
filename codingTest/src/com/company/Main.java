package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arrA = new int[k];
        for (int i = 0; i < k; ++i) {
            arrA[i] = sc.nextInt();
        }
        int[] arrB = new int[k];
        for (int i = 0; i < k; ++i) {
            arrB[i] = sc.nextInt();
        }

        for (String str : T.solution(k, arrA, arrB)) {
            System.out.println(str);
        }

    }

    private List<String> solution(int k, int[] arrA, int[] arrB) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < k; ++i) {
            int a = arrA[i];
            int b = arrB[i];
            String result = "";
            if (a == b) {
                result = "D";
            } else {
                if (a == 1) {
                    result = b == 2 ? "B" : "A";
                } else if (a == 2) {
                    result = b == 3 ? "B" : "A";
                } else if (a == 3) {
                    result = b == 1 ? "B" : "A";
                }
            }
            answer.add(result);
        }

        return answer;
    }


}
