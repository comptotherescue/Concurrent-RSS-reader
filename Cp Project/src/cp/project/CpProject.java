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
	
    public static void main(String[] args) {
    	Constants.init();
    	runSerial();
    }
}
