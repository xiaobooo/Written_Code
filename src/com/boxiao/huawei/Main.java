package com.boxiao.huawei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str1="";
        for (int i = str.length(); i>1; i--) {
        	for(int j = 0;j < i-1;j++)
            {
	            String str2 = str.substring(j, i);
	            if(Judge(str2)&&str1.length()<str2.length())
	                str1 = str2;
            }
        }
        System.out.println(str1.length());    

    }
    public static boolean Judge(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        int len = ch.length-1;
        while(i<len){
            if(ch[i++]!=ch[len--])
                return false;
        }
        return true;
    }
}