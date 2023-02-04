package com.company.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {

        String4 T = new String4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringList.add(sc.next());
        }

        for (String answer : T.solution(stringList)) {
            System.out.println(answer);
        }
    }

    private List<String> solution(List<String> stringList) {
        List<String> answer = new ArrayList<>();

        for (String str : stringList) {
            answer.add(new StringBuilder(str).reverse().toString());
        }

        return answer;
    }
}
