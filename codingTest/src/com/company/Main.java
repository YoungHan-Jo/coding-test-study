package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(t, str));

    }

    private String solution(int t, String str) {
        String answer = "";

        for (int i = 0; i < t; i++) {

            String tmp = str.substring(0, 7);

            tmp = tmp.replace("*", "0").replace("#","1");


            int num = Integer.parseInt(tmp, 2);

            answer += (char) num;

            str = str.substring(7);

        }

        return answer;
    }
}
