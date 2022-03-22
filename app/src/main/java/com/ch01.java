package com;

import java.util.*;

class ch01 {
    public String solution(String str){
        String answer = "";

        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }

        return answer;
    }


    public static void main(String[] args){
        ch01 T = new ch01();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
