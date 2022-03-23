package com;

import java.util.Scanner;

public class C08_05 {
    //중복순열
    static int n , m , answer = 0;
    static int[] pm;

    public void DFS(int L){

        if(L == m) {
            for(int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i = 1 ; i <= n ; i ++){
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String args[]){
        C08_05 A = new C08_05();
        Scanner kb = new Scanner(System.in);

        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        A.DFS(0);
        System.out.println(answer);
    }

}
