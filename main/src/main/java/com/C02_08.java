//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n , int[] arr){
//        int[] answer = new int[n];
//
//        for (int i = 0 ; i < n ; i ++){
//            int cnt = 1;
//            for(int j = 0 ; j < n ; j ++){
//                if(arr[i] < arr[j]) {
//                    cnt++;
//                }
//            }
//            answer[i] = cnt;
//        }
//        for(int x : answer) System.out.print(x+" ");
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            arr[i] = kb.nextInt();
//        }
//        A.solution(n , arr);
//    }
//}