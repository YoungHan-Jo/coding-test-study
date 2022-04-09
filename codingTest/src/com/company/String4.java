package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4 {

    private List<String> solution(List<String> list) {
        List<String> answer = new ArrayList<>();

        for (String s : list) {
            char[] c = s.toCharArray();

            int lt = 0, rt = s.length() - 1;

            while (lt < rt) {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(c));
        }
        return answer;
    }

    public static void main(String[] args) {
        String4 T = new String4();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(sc.next());
        }

        for (String s : T.solution(list)) {
            System.out.println(s);
        }

    }
}
