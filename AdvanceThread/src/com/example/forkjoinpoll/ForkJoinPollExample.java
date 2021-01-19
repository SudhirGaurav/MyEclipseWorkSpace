package com.example.forkjoinpoll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

class MyForkJoinPoolTastk2 extends RecursiveTask<Object>{

	@Override
	protected Object compute() {

		return null;
	}
	
}
class  MyForkJoinPoolTask extends RecursiveAction{// RecursiveAction is a abstract class,Does not return anythisng

	List<Integer> lis;
	int THRESHOLD =5;
	int result=0;
	
	public MyForkJoinPoolTask(List<Integer> lis) {
		super();
		this.lis = lis;
	}


	@Override
	protected void compute() {
		//System.out.println("Hi Compute: of RucursiveAction abstract class"+lis);
		if(lis.size()<=THRESHOLD)
		{
			//System.out.println("Inside if: ");
			//System.out.println("Compute it simply:");
			for (Integer val : lis) {
				result+=val;
			}
			
		}else{
			//System.out.println("Inside else ");
			MyForkJoinPoolTask subtas1= new MyForkJoinPoolTask(lis.subList(0, THRESHOLD));
			MyForkJoinPoolTask subtas2= new MyForkJoinPoolTask(lis.subList(THRESHOLD+1,lis.size()-1));
			invokeAll(subtas1,subtas2);
			
		}
		
		System.out.println(" Final Result is: "+result);
	}
	
	
}

public class ForkJoinPollExample {

	public static void main(String[] args) throws IOException {
		System.out.println("Main ");
		FileInputStream in=null;
		/*try {
			 in= new FileInputStream(new File("a/b/ee.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		

		MyForkJoinPoolTask task = new MyForkJoinPoolTask(list);
		ForkJoinPool fjp = new ForkJoinPool(12);
		//fjp.submit(task);
		fjp.invoke(task);
		
		
	}
	

}
