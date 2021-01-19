class Count
{
	int count=0;
	public int getCount()
	{
		count++;
		return count;
	}
	
	}
class MyThread implements Runnable{
	
	Count count;
	public MyThread(Count count) {
		this.count=count;
	}

	//int count=0;
	public void run()
	{
		System.out.println("count is:s "+count.getCount());
		//count++;
	}
}


public class SimleShareObjectBitweenThread {

	public static void main(String[] args) {
		Count count = new Count();//I have shared this object....
		
	MyThread task1 = new MyThread(count);
//	MyThread task2 = new MyThread(count);
	
	Thread t1 = new Thread(task1);
	Thread t2 = new Thread(task1);
	Thread t3 = new Thread(task1);
	
	t1.start();
	t2.start();
	t3.start();
	
	
	 // Lock lock = new ReentrantLock();
}

}
