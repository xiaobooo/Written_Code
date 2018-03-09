package com.boxiao.string;

public class Intern {
	public static void main(String[] args) {
		String var[] = new String[50000];
		for(int i= 0;i<50000;i++) {
			var[i] = "s"+i;
		}
		
		long startTime0 = System.currentTimeMillis();
		for(int i= 0;i<50000;i++) {
			var[i]="hello";
		}
		
		long endTime0 = System.currentTimeMillis();
		System.out.println("直接使用字符串: "+
		(endTime0-startTime0)+" ms");
		
		long startTime1 = System.currentTimeMillis();
		for(int i= 0;i<50000;i++) {
			var[i]= new String("hello");
		}
		
		long endTime1 = System.currentTimeMillis();
		System.out.println("直接new关键字创建对象: "+
		(endTime1-startTime1)+" ms");
		
		long startTime2 = System.currentTimeMillis();
		for(int i= 0;i<50000;i++) {
			var[i]=new String("hello");
			var[i]=var[i].intern();
		}
		
		long endTime2 = System.currentTimeMillis();
		System.out.println("使用字符串对象的intern方法: "+
		(endTime2-startTime2)+" ms");
	}
}
