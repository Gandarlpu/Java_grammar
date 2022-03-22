package com;

import java.util.Scanner;

class C08_03 {
    static int n , m , answer = 0;

    public void DFS(int L , int sum , int time , int[] a , int[] b){

        if(time > m) return;
        if(m == time) {
            answer = sum;
        }
        else{
            DFS(L+1 , sum+a[L] , time+b[L] , a , b);
        }

    }

    public static void main(String args[]){
        C08_03 T = new C08_03();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.DFS(0 , 0 , 0 , a, b);
        System.out.println(answer);
    }
}
