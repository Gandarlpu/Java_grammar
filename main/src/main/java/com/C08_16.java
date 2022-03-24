//package com;
//// 섬나라 아일랜드 (BFS)
//import java.util.*;
//
//class Point{
//    int x , y;
//    Point(int x , int y){
//        this.x = x;
//        this.y = y;
//    }
//}
//public class Main {
//    static int n, answer;
//    static int[] dx = {-1, 0, 1, 0, 1, -1, 1, -1};
//    static int[] dy = {0, 1, 0, -1, 1, -1, -1, 1};
//    Queue<Point> Q = new LinkedList<>();
//
//    public void BFS(int x , int y , int[][] board){
//        Q.offer(new Point(x , y));
//
//        while (!Q.isEmpty()) {
//            Point tmp = Q.poll();
//
//            for (int l = 0; l < 8; l++) {
//                int nx = tmp.x + dx[l];
//                int ny = tmp.y + dy[l];
//
//                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
//                    board[nx][ny] = 0;
//                    Q.offer(new Point(nx , ny));
//                }
//
//            }
//        }
//    }
//
//    public void solution(int[][] board){
//        for(int i = 0 ; i < n ; i ++){
//            for(int j = 0 ; j < n ; j ++){
//                if(board[i][j] == 1){
//                    answer++;
//                    board[i][j] = 0; // 최초 섬 발견한 곳 0으로 바꾸기
//                    BFS(i , j , board);
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Main A = new Main();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        int[][] board = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = kb.nextInt();
//            }
//        }
//
//        A.solution(board);
//        System.out.println(answer);
//    }
//}