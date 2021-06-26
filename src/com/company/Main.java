package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(SpinWords(sc.nextLine()));
    }
    public static String SpinWords(String str){
        StringBuilder sb;
        StringBuilder result= new StringBuilder();
        String[] stringArr = str.split(" ");
        for(String words: stringArr){
            if(words.length()>=5){
                sb = new StringBuilder(words);
                sb.reverse();
                result.append(" ").append(sb);
            }else{
                result.append(" ").append(words);
            }
        }
        return result.toString();
    }
}
