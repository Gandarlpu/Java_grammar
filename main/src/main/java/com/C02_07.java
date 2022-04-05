//
//import java.util.*;
//
//public class Main {
//
//    public void solution(int n , int[] arr){
//        int cnt = 0;
//        int answer = 0;
//
//        for(int i = 0 ; i < n ; i ++){
//            if(arr[i] == 1){
//                cnt++;
//                answer += cnt;
//            }else{
//                cnt=0;
//            }
//        }
//        System.out.print(answer);
//    }
//
//    public static void main(String[] args) {
//        com.Main A = new com.Main();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i ++){
//            arr[i] = kb.nextInt();
//        }
//        A.solution(n , arr);
//
//    }
//}