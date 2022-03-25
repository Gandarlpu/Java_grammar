//package com;
//
//import java.util.*;
//
//class Time implements Comparable<Time>{
//    public int time;
//    public char state;
//    Time(int time , char state){
//        this.time = time;
//        this.state = state;
//    }
//
//    @Override
//    public int compareTo(Time o) {
//        if(this.time == o.time) return this.state - o.state;
//        else return this.time - o.time;
//    }
//}
//
//
//public class Main {
//
//    public int solution(ArrayList<Time> arr , int n){
//        Collections.sort(arr);
//        int cnt = 0, answer = Integer.MIN_VALUE;
//
//        for(Time ob : arr){
//            System.out.println(ob.time + " " + ob.state);
//            if(ob.state == 's') cnt++;
//            else cnt--;
//            answer=Math.max(answer , cnt);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        ArrayList<Time> arr = new ArrayList<>();
//        for(int i = 0 ; i < n ; i ++){
//            int s = kb.nextInt();
//            arr.add(new Time(s , 's'));
//            int e = kb.nextInt();
//            arr.add(new Time(e , 'e'));
//
//        }
//        System.out.println(A.solution(arr, n));
//    }
//}