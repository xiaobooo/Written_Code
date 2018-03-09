package com.boxiao.method;

public class Enum {
	public static void main(String[] args) {
		System.out.println("所有汽车的价格： ");
		for(Car c : Car.values()) {
			System.out.println(c + " 需要 "
					+c.getPrice()+" 千美元");
		}
	}
}
