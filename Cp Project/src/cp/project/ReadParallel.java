package cp.project;

import java.util.List;

import javafx.util.Pair;

public class ReadParallel implements Runnable {
	
	@Override
	public void run() {
		while(true) {
			Sequencer s = new Sequencer();
			int idx = s.getNext();
			List<Pair<String, String>> list = Constants.getSubscriptions();
			if( idx < list.size()) {
				ArrayListRSSStoreFeed feedStore = new ArrayListRSSStoreFeed();
				RSSFeedRead.read(list.get(idx), feedStore,"ParallelRss");
			}else {
				break;
			}
		}
	}
}
