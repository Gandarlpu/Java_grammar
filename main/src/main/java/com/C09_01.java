//package com;
//
//import java.util.*;
//
//class Body implements Comparable<Body>{
//    public int h , w;
//    Body(int h , int w){
//        this.h = h;
//        this.w = w;
//    }
//    @Override
//    public int compareTo(Body o) {
//        return o.h - this.h;
//    }
//}
//
//public class Main {
//
//    public int solution(ArrayList<Body> arr , int n){
//        int cnt = 0;
//        Collections.sort(arr);
//        int max = Integer.MIN_VALUE;
//
//        for(Body ob : arr){
//            // 키 정렬된 곳에서 몸무게만 비교
//            if(ob.w > max){
//                max = ob.w;
//                cnt++;
//            }
//        }
//
//        return cnt;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        ArrayList<Body> arr = new ArrayList<>();
//        for(int i = 0 ; i < n ; i ++){
//            int h = kb.nextInt();
//            int w = kb.nextInt();
//            arr.add(new Body(h , w));
//        }
//        System.out.println(A.solution(arr, n));
//    }
//}