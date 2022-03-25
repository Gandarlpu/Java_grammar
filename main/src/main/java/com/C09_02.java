//package com;
//
//import java.util.*;
//
//class Time implements Comparable<Time>{
//    public int s , e;
//    Time(int s , int e){
//        this.s = s;
//        this.e = e;
//    }
//
//    @Override
//    public int compareTo(Time o) {
//        if(this.e == o.e) return this.s - o.s;
//        else return this.e - o.e;
//    }
//}
//
//
//public class Main {
//
//    public int solution(ArrayList<Time> arr , int n){
//        int et = 0;
//        Collections.sort(arr);
//        int cnt = 0;
//
//        for(Time ob : arr){
//            if(ob.s >= et){
//                et = ob.e;
//                cnt++;
//            }
//        }
//        return cnt++;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        ArrayList<Time> arr = new ArrayList<>();
//        for(int i = 0 ; i < n ; i ++){
//            int s = kb.nextInt();
//            int e = kb.nextInt();
//            arr.add(new Time(s , e));
//        }
//        System.out.println(A.solution(arr, n));
//    }
//}