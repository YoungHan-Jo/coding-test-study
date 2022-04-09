package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution(List<String> list) {
        List<String> answerList = new ArrayList<>();

        for (String s : list) {
            char[] c = s.toCharArray();

            int lt = 0, rt = s.length() -1;

            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }

            answerList.add(String.valueOf(c));
        }

        return answerList;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(scanner.nextLine());
        }
        for (String s : T.solution(list)) {
            System.out.println(s);
        }
    }
}
