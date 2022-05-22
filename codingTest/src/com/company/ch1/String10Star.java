package com.company.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String10Star {
    
    public static void main(String[] args) {
        String10Star T = new String10Star();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String t = sc.next();
        System.out.println(T.solution(str,t));
    }

    private String solution(String str, String t) {
        List<Integer> answerList = new ArrayList<>();
        int p = 1000;

        char[] s = str.toCharArray();

        for (int i = 0; i < str.length(); ++i) {
            if (s[i] != t.toCharArray()[0]) {
                answerList.add(p += 1);
            } else {
                answerList.add(p = 0);
            }
        }

        p = 1000;

        for (int i = str.length() - 1; i >= 0; --i) {
            if (s[i] != t.toCharArray()[0]) {
                if (answerList.get(i) > (p += 1)) {
                    answerList.set(i, p);
                }
            } else {
                if (answerList.get(i) > (p = 0)) {
                    answerList.set(i, p);
                }
            }
        }

        String answer = "";

        for (int i : answerList) {
            answer += i + " ";
        }

        return answer;
    }
}
