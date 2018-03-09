package com.boxiao.runnable;

public class Test {
	public static void main(String[] args) {
		/*RunnableDemo R1 = new RunnableDemo("boxiao");
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("gewu");
		R2.start();*/
		
		 Runnable hello = new DiaplayMessage("Hello");
	      Thread thread1 = new Thread(hello);
	      thread1.setDaemon(true);
	      thread1.setName("hello");
	      System.out.println("Starting hello thread...");
	      thread1.start();
	      
	      Runnable bye = new DiaplayMessage("Goodbye");
	      Thread thread2 = new Thread(bye);
	      thread2.setPriority(Thread.MIN_PRIORITY);
	      thread2.setDaemon(true);
	      System.out.println("Starting goodbye thread...");
	      thread2.start();
	}
}
