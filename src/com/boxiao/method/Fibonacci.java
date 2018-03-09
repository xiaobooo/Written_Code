package com.boxiao.method;

public class Fibonacci {
	public static void main(String[] args) {
		for(int counter = 0; counter <= 10;counter++) {
			System.out.printf("Fibonacci of %d is : %d\n",
					counter,fibonacci(counter));
		}
	}

	private static long fibonacci(long num) {
		// TODO Auto-generated method stub
		if((num == 0)||(num == 1)) {
			return num;
		}else {
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
}
