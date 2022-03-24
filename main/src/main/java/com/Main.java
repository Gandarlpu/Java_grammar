package com;

import java.util.*;

class Point{
    public int x , y;
    Point(int x , int y){
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int n , m , len , answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> pz , hs;

    public void DFS(int L , int s){

        if(L == m){
            int sum = 0;
            for(Point h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    // 살아남은 피자집의 arrayIndex번호
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
                // 각 집들마다 피자집 거리가 계산되서 sum에 더해짐
            }
            answer = Math.min(answer , sum);
        }else{
            // 조합 알고리즘으로 0~5(피자집)를 조합해서 4개를 뽑는 경우의 수 2개는 폐점
            for(int i = s; i < len ; i ++){
                System.out.println("재귀 이전 값 : " + i);
                combi[L] = i;
                DFS(L+1 , i+1);
                System.out.println(" 재귀 후 값 : "+i);
            }
        }
    }

    public static void main(String[] args) {
        Main A = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                int tmp = kb.nextInt();
                if(tmp == 1) hs.add(new Point(i , j));
                else if(tmp == 2) pz.add(new Point(i , j));
            }
        }
        len = pz.size();
        combi = new int[m];
        A.DFS(0,0);
        System.out.println(answer);

    }
}