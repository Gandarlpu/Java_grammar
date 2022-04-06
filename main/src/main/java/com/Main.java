package com;

import java.util.*;

public class Main {
    static int n, answer , size;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static ArrayList<Integer> arr = new ArrayList<>();

    public void DFS(int x , int y, int[][] board) {

        for(int i = 0 ; i < 4 ; i ++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n &&
                                    board[nx][ny] == 1){
                size++;
                board[nx][ny] = 0;
                DFS(nx , ny , board);
            }
        }
    }

    public void solution(int[][] board){
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j ++){
                if(board[i][j] == 1){
                    answer ++;
                    board[i][j] = 0;
                    arr.add(size);
                    DFS(i , j , board);
                    size=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main A = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        A.solution(board);
        System.out.println(answer);
        System.out.print(arr+" ");
    }
}