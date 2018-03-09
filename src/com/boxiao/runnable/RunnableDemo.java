package com.boxiao.runnable;

public class RunnableDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	public RunnableDemo(String name) {
		// TODO Auto-generated constructor stub
		threadName = name;
		System.out.println("Creating "+ threadName);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running "+threadName);
		try {
			for(int i=4;i>0;i--) {
				System.out.println("Thread: "+threadName+","+i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread " +  threadName + " interrupted.");
		}
		System.out.println("Thread "+threadName+" exiting");
	}
	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting "+ threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}
}
