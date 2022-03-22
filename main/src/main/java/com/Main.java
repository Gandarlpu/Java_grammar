package com;

import java.util.*;
class Main{

    public static void main(String[] args){
        C07_08 A = new C07_08();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int e = kb.nextInt();
        System.out.println(A.BFS(s , e));
    }
}