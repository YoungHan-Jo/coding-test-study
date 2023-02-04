package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strList.add(sc.next());
        }

        List<String> answer = T.solution(strList);
        for (String a : answer) {
            System.out.println(a);
        }

    }

    private List<String> solution(List<String> strList) {
        List<String> answer = new ArrayList<>();
        for (String str : strList) {
            char[] chars = str.toCharArray();
            int lt = 0;
            int rt = chars.length-1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;

                lt++;
                rt--;
            }

            answer.add(String.valueOf(chars));
        }

        return answer;
    }


}
