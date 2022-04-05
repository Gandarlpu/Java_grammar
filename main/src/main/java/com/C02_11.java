//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n , int[][] arr){
//        int answer = 0;
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 1 ; i <= n ; i ++){
//            int cnt = 0;
//            for(int j = 1 ; j <= 5 ; j ++){
//                for(int k = 1 ; k <= 5 ; k ++){
//                    if(arr[i][k] == arr[j][k]){
//                        cnt++;
//                        break;
//                    }
//                }
//            }
//            if(cnt > max){
//                max = cnt;
//                answer = i;
//            }
//        }
//
//        System.out.println(answer);
//
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n+1][6];
//        for(int i = 1 ; i <= n ; i ++){
//            for(int j = 1 ; j <= 5 ; j ++){
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        A.solution(n , arr);
//    }
//}