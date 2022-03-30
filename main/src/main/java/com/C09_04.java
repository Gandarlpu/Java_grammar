//package com;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//class Lecture implements Comparable<Lecture>{
//    public int m , t;
//    Lecture(int m , int t){
//        this.m = m;
//        this.t = t;
//    }
//
//    @Override
//    public int compareTo(Lecture o) {
//        return o.t - this.t;
//    }
//}
//
//public class Main {
//
//    static ArrayList<Lecture> arr = new ArrayList<>();
//    static int n , max = Integer.MIN_VALUE;
//
//    public int solution(){
//        int answer = 0;
//        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
//        Collections.sort(arr);
//        int j = 0;
//        for(int i = 0 ; i < n ; i ++){
//            System.out.println(arr.get(i).m + " " + arr.get(i).t);
//        }
//
//        // max = 가장 큰 날짜
//        // 1일까지 하루씩 빼기
//        for(int i = max ; i >= 1 ; i --){ // 날짜 max~1일까지
//            for( ; j < n ; j++){ // n번 입력값의 개수 날짜만큼
//                if(arr.get(j).t < i) break; // 입력받은 날짜(j)가 전체날짜(i)보다 작으면
//                pQ.offer(arr.get(j).m);
//            }
//            if(!pQ.isEmpty()) answer += pQ.poll(); // 가장 큰 강연료 부터 더해줌.
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        for(int i = 0 ; i < n ; i ++){
//            int m = kb.nextInt();
//            int t = kb.nextInt();
//            arr.add(new Lecture(m , t));
//            if(t > max) max = t; // max는 입력받은 날짜 중 가장 큰 값. = 3
//        }
//        System.out.println(A.solution());
//    }
//}
