package com;

import java.util.*;

public class Main {

    public void solution(int n , int[][] arr){
        int answer = 0;



        System.out.println(answer);

    }

    public static void main(String[] args) {
        Main A = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0 ; j < n ; j ++){
                arr[i][j] = kb.nextInt();
            }
        }

        A.solution(n , arr);
    }
}