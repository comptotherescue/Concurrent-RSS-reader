/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;
import javafx.util.Pair;
public class CpProject {
	
	private static void runSerial() {
		final long startTime = System.currentTimeMillis();
    	for(Pair<String,String> s : Constants.getSubscriptions()) {
    		ArrayListRSSStoreFeed feedStore = new ArrayListRSSStoreFeed();
    		RSSFeedRead.read(s, feedStore);
    	}
    	final long endTime = System.currentTimeMillis();
    	long duration = endTime - startTime;
    	System.out.println("Total Time Taken : ");
    	System.out.println(duration);
	}
	
	private static void runParallel(){
		Constants.init();
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
		System.out.println("All Done");
	}
	
    public static void main(String[] args) {
    	Constants.init();
    	//runSerial();
    	runParallel();
    }
}
