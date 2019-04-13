package cp.project;

public class ReadParallel implements Runnable {
	
	@Override
	public void run() {
		while(true) {
			Sequencer s = new Sequencer();
			int idx = s.getNext();
			if(Constants.subscriptions.size() > idx) {
				ArrayListRSSStoreFeed feedStore = new ArrayListRSSStoreFeed();
				System.out.println(idx);
				RSSFeedRead.read(Constants.getSubscriptions().get(idx), feedStore);
			}else {
				break;
			}
		}
	}
}
