package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C07_08 {
    static int answer = 0;
    int[] ch;
    int[] jump = {+1,-1,+5};
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s , int e){
        int L = 0;
        ch = new int[10001];
        ch[s] = 1;
        Q.add(s);

        while (!Q.isEmpty()){
            int len = Q.size();

            for(int i = 0 ; i < len ; i++){
                int x = Q.poll();

                for(int j = 0 ; j < jump.length ; j++){
                    int nx = x + jump[j];
                    if(nx == e) return L+1;
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.add(nx);
                    }
                }
            }
            L++;

        }
        return answer;
    }


}
