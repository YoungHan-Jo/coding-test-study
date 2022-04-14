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

        char[] s = str.toCharArray();
        int count = 1;

        for (int i = 0; i < s.length-1; ++i) {
            if (i == s.length - 2) {
                if (s[i] == s[i + 1]) {
                    count = count + 1;
                    answer = answer + s[i] + count;
                } else {
                    if (count == 1) {
                        answer = answer + s[i] + s[i + 1];
                    } else {
                        answer = answer + s[i] + count + s[i + 1];
                    }
                }
                break;
            }
            if (s[i] == s[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    answer = answer + s[i];
                } else {
                    answer = answer + s[i] + count;
                    count = 1;
                }
            }
        }

        return answer;
    }

}
