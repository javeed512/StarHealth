
public class DemoThread extends Thread {

	public static void main(String[] args) { // main-thread

		/*
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * System.out.println("Welcome to Main");
		 * 
		 * }
		 */

		DemoThread t1 = new DemoThread();

		// System.out.println(t1);

		t1.setName("child1");
		//t1.setPriority(Thread.MAX_PRIORITY - 1); // 9

		// System.out.println(t1);

		t1.start(); // t1.run(); internally called

		DemoThread t2 = new DemoThread();
		t2.setName("child2");
		
		t2.start();
		
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("welcome to " + Thread.currentThread().getName());

		}
	}

}
