package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Point{
//    public int x,y;
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//}

//public class C08_14 {
//    static int[][] board , dis;
//    static int answer = Integer.MIN_VALUE;
//    static Queue<Point> Q = new LinkedList<>();
//    static int[] arr_x = {-1,0,+1,0};
//    static int[] arr_y = {0,+1,0,-1};
//    static int n , m;

//    public void BFS(){
//
//        while(!Q.isEmpty()){
//            Point tmp = Q.poll();
//
//            for(int i = 0 ; i < 4 ; i++){
//                int nx = tmp.x + arr_x[i];
//                int ny = tmp.y + arr_y[i];
//
//                if(nx >= 0 && nx < n &&  ny >= 0 && ny < m && board[nx][ny] == 0){
//                    //좌표 큐에 담기
//                    Q.offer(new Point(nx , ny));
//                    //nx,ny board = 1로 바꾸기
//                    board[nx][ny] = 1;
//                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
//                }
//            }
//        }
//    }

//    public static void main(String[] args){
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        m = kb.nextInt();
//        n = kb.nextInt();
//        dis = new int[n][m];
//        board = new int[n][m];
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < m ; j++){
//                board[i][j] = kb.nextInt();
//                if(board[i][j] == 1) Q.offer(new Point(i , j));
//            }
//        }
//
//        A.BFS();
//
//        // dis의 최대값 찾기
//        boolean flag = false;
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < m ; j ++){
//                if(dis[i][j] == 0) flag = false;
//            }
//        }
//        if(flag){
//            for(int i = 0 ; i < n ; i ++){
//                for(int j = 0 ; j < m ; j ++){
//                    answer = Math.max(answer , board[i][j]);
//                }
//            }
//        }
//        System.out.println(answer);
//    }


//}
