//package com;
//
//import java.util.*;
//
//public class Main {
//    static int[] dx = {1,-1,0,0};
//    static int[] dy = {0,0,-1,1};
//
//    public void solution(int n , int[][] arr){
//        int answer = 0;
//
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < n ; j ++){
//                boolean flag = true;
//                for(int l = 0 ; l < 4 ; l ++){
//                    int nx = i + dx[l];
//                    int ny = j + dy[l];
//                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]){
//                        flag = false;
//                        break;
//                    }
//                }
//                if(flag) answer ++;
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
//        int[][] arr = new int[n][n];
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < n ; j ++){
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        A.solution(n , arr);
//    }
//}