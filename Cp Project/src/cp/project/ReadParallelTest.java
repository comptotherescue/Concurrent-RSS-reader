package cp.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ReadParallelTest {
	
	@Test
	void Test() {
		Constants.init();
		Thread threads[] = new Thread[4];
		for(int i = 0 ; i < 4; i++) {
			threads[i] = new Thread(new ReadParallel());
			threads[i].start();
		}
	}
	

}
