//PLease look on second Eclpse


class Even implements Runnable {
	volatile int number;
	Object lock;

	public Even(int number, Object obj) {
		super();
		this.number = number;
		this.lock = obj;
	}

	public void run() {

		synchronized (lock) {
			while (!Odd.oddFlag) {
				while (number % 2 != 0)// Even
				{
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} 

					System.out.println("Even is: " + number);
					number++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Odd.oddFlag=true;
					lock.notifyAll();

				
			}
		}

	}
}

class Odd implements Runnable {
	volatile int number;
	Object lock;
	public static boolean oddFlag=true;

	public Odd(int number, Object obj) {
		super();
		this.number = number;
		this.lock = obj;
	}

	public void run() {

		synchronized (lock) {
			while (oddFlag) {
				while (number % 2 == 0)// Odd
				{

					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

					System.out.println("Odd is: " + number);
					number++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					oddFlag=false;
					lock.notifyAll();
			}
		}
	}
}

public class EvenOddPrint {

	public static void main(String[] args) {

		int number = 1 ;
		Object lock = new Object();

		Even even = new Even(number, lock);
		Odd odd = new Odd(number, lock);

		Thread oddThread = new Thread(odd);
		Thread evenThread = new Thread(even);

		oddThread.start();
		evenThread.start();
	}

}
