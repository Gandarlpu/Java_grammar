//package com;
//
//import java.util.*;
//
//public class Main {
//
//    public void solution(String s){
//
//        String answer = "";
//
//        for(int i = 0 ; i < s.length() ; i ++){
//            if(s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);
//        }
//
//        System.out.print(answer);
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.next();
//        A.solution(s);
//    }
//}