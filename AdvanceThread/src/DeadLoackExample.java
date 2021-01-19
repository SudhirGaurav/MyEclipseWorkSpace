class MyThread1 implements Runnable {

	public void run() {

		System.out.println("MyThread1: " + Thread.currentThread().getName());
		synchronized (Integer.class) {
			System.out.println("MyThread1 is aquiring a lock on integer Class");
			synchronized (String.class) {
				
				System.out.println("MyThread1 is aquiring a lock on String Class");

			}
		}
	}

}

class MyThread2 implements Runnable {

	public void run() {

		System.out.println("MyThread2 " + Thread.currentThread().getName());
		synchronized (String.class) {
			System.out.println("MyThread2 is aquiring a lock on String Class");

			synchronized (Integer.class) {
				System.out.println("MyThread2 is aquiring a lock on Integer Class");

			}
		}
	}

}

public class DeadLoackExample {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread2());

		t1.start();
		t2.start();
		

	}

}
