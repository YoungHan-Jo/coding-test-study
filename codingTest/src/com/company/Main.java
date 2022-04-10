package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String solution = T.solution(str);
        System.out.println(solution);

    }

    private String solution(String str) {

        String answer = "";

        for (char c1 : str.toCharArray()) {
            if (answer.indexOf(c1) == -1) {
                answer += c1;
            }
        }
        return answer;

    }
}
