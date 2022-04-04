//package com;
//
//import java.util.Arrays;
//import java.util.Scanner;
// 최대점수 구하기(냅색알고리즘)
//class Main{
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] dy = new int[m+1];
//        for(int i = 0 ; i < n ; i ++){
//            int ps = kb.nextInt();
//            int pt = kb.nextInt();
//            for(int j=m ; j >= pt ; j --){
//                dy[j] = Math.max(dy[j] , dy[j-pt]+ps);
//            }
//        }
//        for(int i = 0 ; i < m+1 ; i ++){
//            System.out.print(dy[i]+" ");
//        }
//
//
//    }
//}