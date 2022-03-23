package com;

public class C08_07 {
    // 조합수(메모리제이션)
    int[][] arr = new int[35][35];

    public int DFS(int n , int r){
        if(arr[n][r] > 0) return arr[n][r];
        if(n == r || r == 0) return 1;
        else{
            return arr[n][r] = DFS(n-1 , r-1) + DFS(n-1 , r);
        }
    }
}
