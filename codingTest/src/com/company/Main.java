package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        String str = sc.next() + " ";
        for (int i = 0; i < n; i++) {
            arr[i] = str.substring(0,7);
            str = str.substring(7);
        }

        System.out.println(T.solution(arr));

    }

    private String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length ; i++) {
            answer += getCharFromStringBinary(arr[i]);
        }
        return answer;
    }
    private char getCharFromStringBinary(String str) {
        String replace = str.replace("#", "1").replace("*", "0");
        return (char) (int) Integer.valueOf(replace, 2);
    }


}
