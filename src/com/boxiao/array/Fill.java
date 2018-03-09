package com.boxiao.array;

import java.util.Arrays;

public class Fill {
	public static void main(String[] args) {
		int array[] = new int[6];
		Arrays.fill(array, 100);
		for(int val:array) {
			System.out.println(val);
		}
		System.out.println("--------------------");
		Arrays.fill(array, 3,6,9);
		for(int val:array) {
			System.out.println(val);
		}
	}
}
