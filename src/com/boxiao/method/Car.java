package com.boxiao.method;

public enum Car {
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	private int price;
	Car(int o){
		price = o;
	}
	int getPrice() {
		return price;
	}
}
