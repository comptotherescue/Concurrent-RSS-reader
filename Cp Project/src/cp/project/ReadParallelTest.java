package cp.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ReadParallelTest {
	
	@Test
	void Test() {
		Constants.init_huge();
		Thread threads[] = new Thread[4];
		final long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	
	@Test
	void Test2() {
		Constants.init_small();
		Thread threads[] = new Thread[4];
		final long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	
	@Test
	void Test3() {
		Constants.init_mid();
		Thread threads[] = new Thread[4];
		final long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	
	@Test
	void Test4() {
		Constants.init_large();
		Thread threads[] = new Thread[4];
		final long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	
	@Test
	void Test5() {
		Constants.init_veryLarge();
		Thread threads[] = new Thread[4];
		final long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken by Parallel Method: ");
    	System.out.println(duration);
	}
	

}
