//package com;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//class Schedule implements Comparable<Schedule>{
//    public int money , time;
//    Schedule(int money , int time){
//        this.money = money;
//        this.time = time;
//    }
//    @Override
//    public int compareTo(Schedule o) {
//        return o.time - this.time;
//    }
//}
//
//public class Main {
//    static int n , max = Integer.MIN_VALUE;
//
//    public int solution(ArrayList<Schedule> arr){
//        int answer = 0;
//        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
//        // 날짜가 큰것부터 정렬
//        Collections.sort(arr);
//        int j = 0;
//
//        for(int i = max ; i >= 1 ; i --){
//            for( ; j < n ; j++){
//                if(arr.get(j).time < i) break;
//                pQ.add(arr.get(j).money);
//            }
//            // 큐 안의 강연들 중 가장 큰 강연료를 먼저 넣는다.
//            if(!pQ.isEmpty()) answer += pQ.poll();
//        }
//        return answer;
//    }
//
//    public static void main(String[] args) {
//
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        ArrayList<Schedule> array = new ArrayList<>();
//        for(int i = 0 ; i < n ; i ++){
//            int m = kb.nextInt();
//            int d = kb.nextInt();
//            array.add(new Schedule(m , d));
//            if(d > max) max = d;
//        }
//        System.out.println(A.solution(array));
//    }
//}
