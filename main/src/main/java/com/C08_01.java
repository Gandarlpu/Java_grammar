package com;

import java.util.Scanner;

class C08_01 {
    static String answer = "NO";
    static int L , total = 0;
    static boolean flag = false;

    public void DFS(int n, int sum ,int[] arr){
        if(flag) return;
        if(sum > total) return;
        if(L == n) {
            if(total/2 == sum){
                answer = "YES";
                flag = true;
            }
        }
        else{
            DFS(L+1 , sum+arr[L] , arr);
            DFS(L+1 , sum , arr);
        }
    }

    public static void main(String[] args){
        C08_01 T = new C08_01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = kb.nextInt();
            total += arr[i];
        }

        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
