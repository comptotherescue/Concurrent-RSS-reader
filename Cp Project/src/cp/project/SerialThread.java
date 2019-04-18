package cp.project;

import java.util.List;

import javafx.util.Pair;

public class SerialThread implements Runnable{

	@Override
	public void run() {
		final long startTime = System.currentTimeMillis();
		List<Pair<String, String>> list = Constants.getSubscriptions();
		for(int i = 0 ;i < list.size();i++) {
			Pair<String,String> s = list.get(i);
    		ArrayListRSSStoreFeed feedStore = new ArrayListRSSStoreFeed();
    		RSSFeedRead.read(s, feedStore,"SerialRss");
    	}
    	final long endTime = System.currentTimeMillis();
    	long duration = endTime - startTime;
    	System.out.println("Total Time Taken By serial Method : ");
    	System.out.println(duration);
	}

}

 