package com.boxiao.xiecheng;

import java.util.Iterator;
import java.util.TreeSet;


public class test {
	public static void main(String[] args) {
		String str="01211113477440000447756677899123";
		TreeSet<String> ts=new TreeSet<>();
		 int len=str.length();
		for(int i=0;i<len;i++){
		ts.add(str.charAt(i)+"");
		}

		Iterator<String> i=ts.iterator();
		StringBuilder sb=new StringBuilder();
		while(i.hasNext()){
		sb.append(i.next());
		}
		
		System.out.println(sb);
	}
}
