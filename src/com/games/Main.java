package com.games;

public class Main {

    public static void main(String[] args) {
	String val = booleanToWord(false);
        System.out.println(val);
    }
    public static String booleanToWord(boolean b){

        if(b == true){
            return "Yes";
        } else {
            return "No";
        }
    }
}
