//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n , int[] A_arr , int[] B_arr){
//        // 1. 가위 2. 바위 3. 보
//        for(int i = 0 ; i < n ; i ++){
//            if(A_arr[i] == B_arr[i]){
//                System.out.println("D");
//            }else if((A_arr[i] == 1 && B_arr[i] == 2) || (A_arr[i] == 2 && B_arr[i] == 3) ||
//                    A_arr[i] == 3 && B_arr[i] == 1) {
//                System.out.println("B");
//            }else{
//                System.out.println("A");
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] A_arr = new int[n];
//        int[] B_arr = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            A_arr[i] = kb.nextInt();
//        }
//        for(int i = 0 ; i < n ; i ++){
//            B_arr[i] = kb.nextInt();
//        }
//
//        A.solution(n, A_arr , B_arr);
//
//    }
//}