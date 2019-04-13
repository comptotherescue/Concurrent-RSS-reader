package cp.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ReadParallelTest {
	
	@Test
	void Test() {
		Constants.init();
		ReadParallel[] rp = new ReadParallel[4];
		
		Thread threads[] = new Thread[4];
		for(int i = 0 ; i < 4; i++) {
			rp[i] = new ReadParallel();
			threads[i] = new Thread(rp[i]);
			threads[i].start();
		}
	}
	

}
