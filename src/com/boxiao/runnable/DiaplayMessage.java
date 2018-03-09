package com.boxiao.runnable;

public class DiaplayMessage implements Runnable{
	private Thread t;
	private String message;
	
	public DiaplayMessage(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(message);
		}
	}
	
	 public void start () {
	      if (t == null) {
	         t = new Thread (this, message);
	         t.start ();
	      }
	   }
	
}
