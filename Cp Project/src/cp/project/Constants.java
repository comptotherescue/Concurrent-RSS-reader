package cp.project;

import java.util.*;

import javafx.util.Pair;

public class Constants {
	final static String connectionString = 
			"mongodb://bankarohit1809:1234567890@banka-kulkarni-shard-00-00-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-01-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-02-ghw3i.mongodb.net:27017/test?ssl=true&replicaSet=BANKA-KULKARNI-shard-0&authSource=admin&retryWrites=true";
	public static List<Pair<String,String>> subscriptions = new ArrayList<Pair<String,String>>();
	
	public static void init() {
		subscriptions.add(new Pair<String,String>("http://www.espn.com/espn/rss/news","ESPN"));
		subscriptions.add(new Pair<String,String>("http://rss.nytimes.com/services/xml/rss/nyt/US.xml","NYTIMES"));
		subscriptions.add(new Pair<String,String>("https://feeds.megaphone.fm/LM1344278906","Russell Brand Podcast"));
		subscriptions.add(new Pair<String,String>("https://www.npr.org/rss/podcast.php?id=510298","NPR"));
		//subscriptions.add(new Pair<String,String>("http://podcastfeeds.nbcnews.com/meetthepress","Post card feeds"));
	}

	public static List<Pair<String,String>> getSubscriptions() {
		return subscriptions;
	}
}
