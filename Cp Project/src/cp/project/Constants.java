package cp.project;

import java.util.*;

public class Constants {
	final static String connectionString = 
			"mongodb://bankarohit1809:1234567890@banka-kulkarni-shard-00-00-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-01-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-02-ghw3i.mongodb.net:27017/test?ssl=true&replicaSet=BANKA-KULKARNI-shard-0&authSource=admin&retryWrites=true";
	public static List<String> subscriptions = new ArrayList<String>();
	
	public static void init() {
		subscriptions.add("http://www.espn.com/espn/rss/news");
	}

	public static List<String> getSubscriptions() {
		init();
		return subscriptions;
	}

	
	
	
	
	

}
