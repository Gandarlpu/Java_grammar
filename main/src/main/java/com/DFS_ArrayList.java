package com;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS_ArrayList {
    static int n;
    static int m;
    static int answer;
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;

    public void DFS(int v){

        if(v == n) answer++;
        else{
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args){
        DFS_ArrayList T = new DFS_ArrayList();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        // 객체 생성
        for(int i = 0 ; i <=n ; i ++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n+1];
        for(int i = 0 ; i < m ; i ++){
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }

}
