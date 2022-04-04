//package com;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//가장 높은 탑 쌓기

//class Top implements Comparable<Top>{
//    public int u , h , w;
//    Top(int u , int h , int w){
//        this.u = u;
//        this.h = h;
//        this.w = w;
//    }
//
//    @Override
//    public int compareTo(Top o) {
//        return o.u - this.u;
//    }
//}
//
//class Main{
//    static int[] dy;
//    public int solution(int n , ArrayList<Top> arr){
//        int answer = 0;
//        Collections.sort(arr);
//        dy[0] = arr.get(0).h;
//        answer = dy[0];
//
//        for(int i = 1 ; i < arr.size() ; i ++){
//            int max_h = 0;
//            for(int j = i-1 ; j >= 0 ; j --){
                // j가 계속 dy뒤로 돌면서 최대값이 있는지 확인
//                if(arr.get(j).w > arr.get(i).w && dy[j] > max_h){
//                    max_h = dy[j];
//                }
//            }
//            dy[i] = max_h+arr.get(i).h;
//            answer = Math.max(answer , dy[i]);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        dy = new int[n];
//        ArrayList<Top> arr = new ArrayList<>();
//        for(int i = 0 ; i < n ; i ++){
//            int u = kb.nextInt();
//            int h = kb.nextInt();
//            int w = kb.nextInt();
//            arr.add(new Top(u,h,w));
//        }
//        System.out.print(T.solution(n , arr));
//    }
//}