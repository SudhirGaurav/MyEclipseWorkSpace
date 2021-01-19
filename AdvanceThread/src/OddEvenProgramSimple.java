class Number {
	int count = 0;

	public int getCount() {
		return ++count;
	}
}

class PrintOddEven implements Runnable {

	Number number;
	boolean isOddEven;
	boolean flag=false;//False for odd print and true for even print 

	public PrintOddEven(Number number, boolean isOddEven) {
		this.number = number;
		this.isOddEven = isOddEven;
	}
	public void run() {
		
		try{
		//while (true) {
			//if (!isOddEven) {
				//System.out.println("Inside Odd");
				printOdd();
			//} else {
				//System.out.println("Inside even");
				printEven();
			//}
		//}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		// System.out.println(number.getCount());

	}

	private void printEven() throws InterruptedException {
		
		//while(true)
		synchronized (number) {
			while(!flag)
			{
				number.wait();
			}
			System.out.println("Even is:"+number.getCount());
			flag=false;
			Thread.sleep(1000);
			number.notifyAll();
		}
	}

	private void printOdd() throws InterruptedException {
		//while(true)
		synchronized (number) {
			while(flag){
				//System.out.println("Odd is wating ");
				number.wait();
			}
				
				System.out.println("Odd is: "+number.getCount());
				flag=true;
				Thread.sleep(1000);
				//System.out.println("Odd thread will notify");
				number.notifyAll();
			
		}
		
			
	}
}

public class OddEvenProgramSimple {

	public static void main(String[] args) {
		Number number = new Number();
		System.out.println("Odd Even No iss:");
		Thread t1 = new Thread(new PrintOddEven(number, false));// For Odd
		Thread t2 = new Thread(new PrintOddEven(number, true));// For Even
		t2.start();
		t1.start();
		/*try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
