//package com;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//// 다이나믹 프로그래밍
//// 계단오르기
//class Main{
//    static int[] dy;
//    public int solution(int n){
//        dy[1] = 1;
//        dy[2] = 2;
//
//        for(int i = 3 ; i <= n ; i++){
//            dy[i] = dy[i-2] + dy[i-1];
//        }
//
//        return dy[n];
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        dy = new int[n+1];
//
//        System.out.print(T.solution(n));
//    }
//}