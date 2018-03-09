package com.boxiao.string;

public class Performance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<50000;i++)
		{
			String s1 = "Hello";
			String s2 = "Hello";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("通过String 关键词创建字符串"
				+":"+(endTime-startTime)
				+" 毫秒");
		
		long startTime1 = System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String s3 = new String("Hello");
			String s4 = new String("Hello");
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("通过String对象创建字符串"
				+":"+(endTime1-startTime1)
				+" 毫秒");
	}
}
