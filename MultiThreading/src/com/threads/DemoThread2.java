package com.threads;

public class DemoThread2 implements Runnable {

	@Override
	public void run() {
		
		
		for(int i=0; i<5; i++) {
			
			System.out.println(Thread.currentThread().getName());
			
		}

	}

	public static void main(String[] args) {

		Runnable r1 = new DemoThread2();

		Thread t1 = new Thread(r1);

		t1.setName("Ajay");
		//System.out.println(t1.isAlive());

		Thread t2 = new Thread(r1);

		t2.setName("Mahesh");
		
		t2.start();
		t1.start();
		
		//System.out.println(t1.isAlive());

	}

}
