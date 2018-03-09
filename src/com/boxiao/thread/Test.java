package com.boxiao.thread;

public class Test {
	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("boxiao");	
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("gewu");
		T2.start();
	}

	
}
