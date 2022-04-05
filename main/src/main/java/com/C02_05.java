//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n){
//        int cnt = 0;
//        int[] ch = new int[n+1];
//
//        for(int i = 2 ; i <= n ; i ++){
//            if(ch[i] == 0){
//                cnt++;
//                for(int j = i ; j <= n ; j=j+i){ // j배수의 배열을 확인
//                    ch[j] = 1;
//                }
//            }
//        }
//        System.out.print(cnt);
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//
//
//        A.solution(n);
//
//    }
//}