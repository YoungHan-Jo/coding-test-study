package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        str +=  " ";
        int p = 1;
        for (int i = 0; i < str.length()-1 ; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                p++;
            } else {
                if (p == 1) {
                    answer = answer + str.charAt(i);
                } else {
                    answer = answer +  str.charAt(i) + p;
                }
                p = 1;
            }
        }
        return answer;
    }
}
