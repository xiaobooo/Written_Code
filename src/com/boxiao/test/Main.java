package com.boxiao.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String str1=null;
		Scanner in = new Scanner(System.in);
		str1=in.nextLine();
		int []array =new int[1000];
		int temp;
		temp = Integer.parseInt(str1);	
		int i=0;
		while(temp>0) {
			array[i]=temp%10;
			i++;
		}
		Arrays.sort(array);
	}
}
