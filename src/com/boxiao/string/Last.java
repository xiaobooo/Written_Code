package com.boxiao.string;

public class Last {
	public static void main(String[] args) {
		String str = "BoXiaoLiu,living";
		int lastIndex = str.lastIndexOf("living");
		if(lastIndex == -1) {
			System.out.println("Not find the string");
		}else {
			System.out.println("The string is finded at :"+lastIndex);
		}
	}
}
