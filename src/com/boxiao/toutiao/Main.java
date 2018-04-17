package com.boxiao.toutiao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String [] str = new String [100];
		for(int i = 0; i<n; i++) {
			Scanner in=new Scanner(System.in);
			str[i] = in.nextLine();
		}
		int [] num =new int[str.length];
		for(int i = 0; i<n; i++) {
			if(str[i].length()<=10)
				System.out.println(str[i]);
			else {
				num[i]=str[i].length()-2;
				System.out.println(str[i].substring(0,1)+num[i]+str[i].charAt(str[i].length()-1));	
			}			
		}
	}
}
