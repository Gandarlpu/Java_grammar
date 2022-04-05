//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n , int[][] arr){
//        int answer = 0;
//        int sum1 , sum2;
//
//        // 행,열
//        for(int i = 0 ; i < n ; i ++){
//            sum1=sum2=0;
//            for(int j = 0 ; j < n ; j ++){
//                sum1 += arr[i][j]; // 행
//                sum2 += arr[j][i]; // 열
//            }
//            answer = Math.max(answer , sum2);
//            answer = Math.max(answer , sum1);
//        }
//
//        // 대각
//        sum1=sum2=0;
//        for(int i = 0 ; i < n ; i ++){
//            sum1 += arr[i][i];
//            sum2 += arr[i][n-i-1];
//        }
//        answer = Math.max(answer , sum2);
//        answer = Math.max(answer , sum1);
//
//        System.out.print(answer);
//
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < n ; j ++){
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        A.solution(n , arr);
//    }
//}