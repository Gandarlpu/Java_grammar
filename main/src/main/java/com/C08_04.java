package com;

import java.util.Scanner;

class C08_04 {
    static int n , m , answer = Integer.MAX_VALUE;

    public void DFS(int L , int sum , int[] arr){

        if(sum > m) return;
        if(sum == m){
            L = Math.min(L , answer);
            answer = L;
        }else{
            for(int i = 0 ; i < arr.length ; i++){
                DFS(L+1 , sum+arr[i] , arr);
            }
        }
    }


    public static void main(String args[]){
        C08_04 T = new C08_04();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        T.DFS(0 , 0 , arr);
        System.out.println(answer);
    }
}
