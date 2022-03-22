package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_shortarray {
    static int n , m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch , dis;

    public void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1; // 체크배열
        dis[v] = 0; // 경로레벨 배열
        queue.offer(v);
        while (!queue.isEmpty()){
            int cv = queue.poll();
            for(int nv : graph.get(cv)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }

    }


    public static void main(String args[]){
        BFS_shortarray T = new BFS_shortarray();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        // 객체 생성
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];
        dis = new int[n+1];
        for(int i = 0 ; i < m ; i ++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }

        T.BFS(1);
        for(int i = 2; i <= n; i ++){
            System.out.println(i+" : " + dis[i]);
        }

    }

}
