package com;

public class C08_08 {
    // 수열 추측하기
    static int[] b , p , ch;
    static int n , f;
    boolean flag = false;
    int [][] dy = new int[35][35];

    public int combi(int n , int r){
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=combi(n-1 , r-1)+combi(n-1, r);
    }

    public void DFS(int L , int sum){
        if(flag) return;
        if(L == n){
            if(sum == f) {
                for(int x : p) System.out.print(x+" ");
                flag=true;
            }
        }else{
            for(int i = 1 ; i <= n ; i ++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1 , sum+(p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

}
