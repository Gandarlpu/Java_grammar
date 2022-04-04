//package com;
//
//import java.util.Arrays;
//import java.util.Scanner;
// 동전교환(냅색 알고리즘)
//class Main{
//    static int[] dy;
//
//    public int solution(int n , int m , int[] coin){
//
//        Arrays.fill(dy,Integer.MAX_VALUE);
//        dy[0] = 0;
//
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = coin[i] ; j <= m ; j++){
//                dy[j] = Math.min(dy[j] , dy[j - coin[i]]+1);
//            }
//        }
//
//        return dy[m];
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] coin = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            coin[i] = kb.nextInt();
//        }
//        int m = kb.nextInt();
//        dy = new int[m+1];
//        System.out.println(T.solution(n , m , coin));
//
//    }
//}