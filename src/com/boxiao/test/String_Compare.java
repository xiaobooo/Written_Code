package com.boxiao.test;

import java.util.Scanner;

public class String_Compare {
	public static void main(String[] args) {
		String str1=null;
		String str2=null;
		Scanner in = new Scanner(System.in);
		str1=in.nextLine();
		str2=in.nextLine();
		int sum=1;
		
		for(int i=0;i<str1.length()-str2.length()+1;i++) {
			int k=i;
			for(int j=0;j<str2.length();j++) {
				char  item1 =  str1.charAt(k++);
				char  item2 =  str2.charAt(j); 	
				if(item1 == item2 ) {
					sum+=1;
				}
			}
		}
		System.out.println(sum);
	}
}

