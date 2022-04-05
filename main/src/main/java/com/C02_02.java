//package com;
//
//import java.util.*;
//
//public class Main {
//    static int[] arr;
//
//    public int solution(int n , int[] arr){
//        int cnt = 0;
//        int max = 0;
//
//        for(int i = 0 ; i < n ; i++){
//            if(max < arr[i]){
//                cnt++;
//                max = arr[i];
//            }
//        }
//        return cnt;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        arr = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(A.solution(n,arr));
//    }
//}