package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = T.solution(str);
        System.out.println(answer);

    }

    private String solution(String str) {
        String answer = "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String reverse = new StringBuilder(str).reverse().toString();
        if (reverse.equals(str)) {
            answer = "YES";
        }


        return answer;
    }


}
