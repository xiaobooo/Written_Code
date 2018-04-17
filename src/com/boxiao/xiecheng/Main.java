package com.boxiao.xiecheng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static String test(String str) {
		str = str.replaceAll("[^a-z^A-Z^0-9]", "");
		String str2 = str.replaceAll("[a-zA-Z]","");
		String str1 = str.replaceAll("[0-9]","");
		
		TreeSet<String> ts=new TreeSet<>();
		 int len=str2.length();
		for(int i=0;i<len;i++){
		ts.add(str2.charAt(i)+"");
		}

		Iterator<String> i=ts.iterator();
		StringBuilder sb=new StringBuilder();
		while(i.hasNext()){
		sb.append(i.next());
		}
	    sb.append(str1);
	    String s1=sb.toString();
	    
	    return s1;    
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;
            
        String str;
        try {
            str = in.nextLine();
        } catch (Exception e) {
            str = null;
        } 
        res = test(str);
        System.out.println(res);
    }
}
