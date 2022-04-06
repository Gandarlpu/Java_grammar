//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(String s , char t){
//        int[] answer = new int[s.length()];
//        answer[0] = 1000;
//        int p = 0;
//
//        // 왼쪽 e
//        for(int j = 0 ; j < s.length() ; j ++){
//            if(s.charAt(j) != 'e'){
//                p++;
//                answer[j] = p;
//            }else{
//                p = 0;
//                answer[j] = p;
//            }
//        }
//        // 오른쪽 e
//        for(int i = s.length()-1 ; i >= 0 ; i --){
//            if(s.charAt(i) != 'e'){
//                p++;
//                if(answer[i] > p){
//                    answer[i] = p;
//                }
//            }else{
//                p = 0;
//                answer[i] = p;
//            }
//        }
//
//
//        for (int x : answer){
//            System.out.print(x+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.next();
//        char t = kb.next().charAt(0);
//        A.solution(s , t);
//    }
//}