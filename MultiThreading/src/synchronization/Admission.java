package synchronization;

public class Admission implements Runnable {

	static int seats = 1;

	public static void main(String[] args) {

		Admission admission = new Admission();

		Thread t1 = new Thread(admission, "Ajay"); // priority-5

		Thread t2 = new Thread(admission); // priority-5
		t2.setName("Mahesh");

		System.out.println("******WELCOME TO COUNSELLING ******");
		System.out.println("No. of Seats Available Before " + seats);

		t1.start();
		t2.start();

	}

	@Override
	public synchronized void run() {

			
		
		if(seats > 0) {
		System.out.println("Seat Allocated to " + Thread.currentThread().getName());

		seats--;
		}
		else {
			
			System.out.println("Sorry Try Next Year");
			
		}
		
		
		System.out.println("No. of Seats Left " + seats);

	}

}
