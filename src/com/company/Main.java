package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
       System.out.println(spinWords("I am coming immediately"));

    }
    public static String spinWords(String sentence) {
        //Code stuff here
        StringBuilder sb;
        StringBuilder result= new StringBuilder();
        String[] stringArr = sentence.split(" ");
        if(stringArr.length>1){
            for(int i=0;i<stringArr.length;i++){
                if(stringArr[i].length()>=5){
                    sb = new StringBuilder(stringArr[i]).reverse();
                    stringArr[i] = sb.toString();
                }
                if(i == stringArr.length-1){
                    return String.join(" ",stringArr);
                }
            }
        }else{
            result.append(new StringBuilder(sentence).reverse());
        }
        return result.toString();
    }
}
