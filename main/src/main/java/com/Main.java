package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge>{
    public int vex;
    public int cost;
    Edge(int vex , int cost){
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        // cost오름차순
        return this.cost - o.cost;
    }
}

public class Main {
    static int n , m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v , 0));
        dis[v] = 0;
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if(nowCost > dis[now]) continue;

            for(Edge ob : graph.get(now)){
                // 1번(now)와 연결된 정점들의 비용을 비교
                // ob.vex = now에서 이동할 노드의 숫자
                if(dis[ob.vex] > nowCost+ob.cost){
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex , nowCost+ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main A = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        // graph라는 ArrayList안에 ArrayList<Edge>객체를 생성
        // Edge라는 클래스 객체를 저장할 수 있는 ArrayList

        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<Edge>());
        }
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0 ; i < m ; i ++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            graph.get(a).add(new Edge(b , c));
        }
        A.solution(1);
        for(int i = 2; i <= n ; i ++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
