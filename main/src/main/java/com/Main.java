package com;

import java.util.Scanner;

// 다이나믹 프로그래밍
// 최대부분증가수열

class Main{
    static int[] dy;
    public int solution(int n , int[] arr){
        int answer = 0;
        dy[0] = 1;
        for(int i = 1 ; i < n ; i ++){
            int max = 0;
            for(int j = i-1 ; j >= 0 ; j--){
                if(arr[i] > arr[j] && dy[j] > max){
                    max = dy[j];
                }
            }
            dy[i] = max+1;
            answer = Math.max(answer , dy[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        dy = new int[n];
        for(int i = 0 ; i < n ; i ++){
            arr[i] = kb.nextInt();
        }

        System.out.print(T.solution(n , arr));
    }
}