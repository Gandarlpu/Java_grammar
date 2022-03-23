package com;

public class C08_10 {
    // 조합 구하기 (체점지원x)
    static int[] combi;
    static int n , m;

    public void DFS(int L , int s){
        if(L == m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i = s ; i <= n ; i++){
                combi[L] = i;
                DFS(L+1 , i+1);
            }
        }
    }


}
