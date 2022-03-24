//package com;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//// 좌표
//class Point{
//    public int x,y;
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//}
//
//public class C08_13 {
//    // 미로 최단거리 통로(BFS)
//    static int[][] board , dis;
//    static int[] arr_x = {-1,0,+1,0};
//    static int[] arr_y = {0,+1,0,-1};
//    Queue<int[][]> Q = new LinkedList<>();
//
//    public void BFS(int x , int y){
//        Queue<Point> Q = new LinkedList<>();
//        board[x][y] = 1;
//
//        while(!Q.isEmpty()){
//            Point tmp = Q.poll(); // 1,1
//            for(int i = 0 ; i < 4 ; i ++){
//                int nx = tmp.x + arr_x[i];
//                int ny = tmp.y + arr_y[i];
//
//                if(nx >= 1 && nx <= 7 && ny <= 1 && ny <= 7 && board[nx][ny] == 0){
//                    board[nx][ny] = 1;
//                    Q.offer(new Point(nx,ny));
//                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
//                }
//            }
//        }
//    }
//
//
//    public static void main(String[] args){
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        dis = new int[8][8];
//        board = new int[8][8];
//        for(int i = 1 ; i <= 7 ; i ++){
//            for(int j = 1 ; j <= 7 ; j++){
//                board[i][j] = kb.nextInt();
//            }
//        }
//        //A.BFS(1,1);
//        if(dis[7][7] == 0) System.out.println(-1);
//        else System.out.println(dis[7][7]);
//    }
//
//}
