//package com;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//import java.util.Scanner;
//
//// 인접리스트로 그래프 그려야함
//
//class Edge implements Comparable<Edge>{
//    public int vex;
//    public int cost;
//    Edge(int vex , int cost){
//        this.vex = vex;
//        this.cost = cost;
//    }
//
//    @Override
//    public int compareTo(Edge o) {
//        // 작은값 우선순위
//        return this.cost - o.cost;
//    }
//}
//
//public class Main {
//    static int[] unf;
//
//    public static int Find(int v){
//        if(v == unf[v]) return v;
//        else return unf[v] = Find(unf[v]);
//    }
//
//    public static void Union(int a , int b){
//        int fa = Find(a);
//        int fb = Find(b);
//        if(fa != fb) unf[fa] = fb;
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        ArrayList<ArrayList<Edge>> graph = new ArrayList<ArrayList<Edge>>();
//        for(int i = 0 ; i <= n ; i ++){
//            graph.add(new ArrayList<Edge>());
//        }
//        int[] ch = new int[n+1];
//        for(int i = 0 ; i < m ; i ++){
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            int c = kb.nextInt();
//            // 무방향이라서 a->b b->a 2가지로 갈 수 있어야 한다.
//            graph.get(a).add(new Edge(b,c));
//            graph.get(b).add(new Edge(a,c));
//        }
//        int answer = 0;
//        PriorityQueue<Edge> pQ = new PriorityQueue<>();
//        pQ.offer(new Edge(1,0));
//        while(!pQ.isEmpty()){
//            Edge tmp = pQ.poll();
//            int ev = tmp.vex; // 도착 정점
//
//            if(ch[ev] == 0){
//                // 도착정점이 비어있으면
//                ch[ev] = 1;
//                answer += tmp.cost;
//                for(Edge ob : graph.get(ev)){
//                    // ev노드(도착정점)가 새로 갈 수 있는 모든 간선들의 노드와 비용 새로 추가
//                    if(ch[ob.vex] == 0) pQ.offer(new Edge(ob.vex , ob.cost));
//                }
//            }
//        }
//
//        System.out.println(answer);
//    }
//}
