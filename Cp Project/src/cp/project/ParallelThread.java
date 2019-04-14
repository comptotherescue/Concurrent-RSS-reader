package cp.project;

public class ParallelThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Constants.init();
		final long startTime = System.currentTimeMillis();
		Thread threads[] = new Thread[4];
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
		
		for(int i = 0 ; i < 4; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;
		System.out.println("Total Time Taken : ");
    	System.out.println(duration);
		
		
	}

}
