package com;

import java.util.Scanner;

class C08_06 {
    // 순열 구하기
    static int n , m;
    static int[] arr , ch , pm;

    public void DFS(int L){
        if(L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = 0 ; i < n ; i++){
                ch[i] = 1;
                pm[L] = arr[i];
                DFS(L+1);
                ch[i] = 0;
            }

        }
    }


    public static void main(String args[]){
        C08_06 B = new C08_06();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        arr = new int[m];
        for(int i = 0 ; i < m ; i ++){
            arr[i] = kb.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        B.DFS(0);

    }

}
