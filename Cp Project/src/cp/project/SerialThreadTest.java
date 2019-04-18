package cp.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerialThreadTest {

	@Test
	void Test1() {
		Constants.init_huge();
		Thread thread = new Thread(new SerialThread());
		final long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	
	@Test
	void Test2() {
		Constants.init_small();
		Thread thread = new Thread(new SerialThread());
		final long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	@Test
	void Test3() {
		Constants.init_mid();
		Thread thread = new Thread(new SerialThread());
		final long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	@Test
	void Test4() {
		Constants.init_large();
		Thread thread = new Thread(new SerialThread());
		final long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	@Test
	void Test5() {
		Constants.init_veryLarge();
		Thread thread = new Thread(new SerialThread());
		final long startTime = System.currentTimeMillis();
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}

}
