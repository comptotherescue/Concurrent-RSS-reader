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
		subscriptions.add(new Pair<String,String>("https://business.financialpost.com/feed/","FinancialPost"));
		subscriptions.add(new Pair<String,String>("https://hacked.com/feed","Hacked"));
		subscriptions.add(new Pair<String,String>("https://www.techrepublic.com/rssfeeds/articles/","techrepublic"));
		subscriptions.add(new Pair<String,String>("https://themerkle.com/feed/","TheMerkle"));
		subscriptions.add(new Pair<String,String>("https://www.naic.org/press.xml","naic"));
		subscriptions.add(new Pair<String,String>("https://rss.dailyfx.com/feeds/all","DailyFx"));
		subscriptions.add(new Pair<String,String>("https://www.which.co.uk/news/feed/","Which"));
		subscriptions.add(new Pair<String,String>("https://www.technologyreview.com/stories.rss","TechnologyReview"));
		subscriptions.add(new Pair<String,String>("https://99bitcoins.com/feed/","99Bitcoins"));
		subscriptions.add(new Pair<String,String>("https://www.inverse.com/feed/articles/1.rss","Inverse"));
		subscriptions.add(new Pair<String,String>("https://wccftech.com/feed/","WccFTech"));
		subscriptions.add(new Pair<String,String>("https://boingboing.net/feed","BoingBoing"));
		subscriptions.add(new Pair<String,String>("https://www.prnewswire.com/rss/all-news-releases-from-PR-newswire-news.rss","PRNNewsWire"));
		subscriptions.add(new Pair<String,String>("https://www.naic.org/newswire.xml","naic2"));
		subscriptions.add(new Pair<String,String>("https://www.ccn.com/feed/","CNN"));
		subscriptions.add(new Pair<String,String>("http://rss.nzherald.co.nz/rss/xml/nzhtsrsscid_000000698.xml","NZHerald"));
		subscriptions.add(new Pair<String,String>("https://cointelegraph.com/feed","CoinTelegraph"));
		subscriptions.add(new Pair<String,String>("https://www.vanityfair.com/feed/rss","VanityFair"));
		subscriptions.add(new Pair<String,String>("https://news.bitcoin.com/feed/","BitCoin"));
		subscriptions.add(new Pair<String,String>("https://cms.qz.com/feed/","CMSQZ"));
		subscriptions.add(new Pair<String,String>("https://www.androidauthority.com/feed/","AndroidAuthority"));
		subscriptions.add(new Pair<String,String>("http://fortune.com/feed/","Fortune"));
		subscriptions.add(new Pair<String,String>("https://news.google.com/rss/topics/CAAqJggKIiBDQkFTRWdvSUwyMHZNRGx1YlY4U0FtVnVHZ0pWVXlnQVAB?hl=en-US&gl=US&ceid=US:en","Googlefeed"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/educationnews.rss","Nasa"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/breaking_news.rss","Nasa2"));
		subscriptions.add(new Pair<String,String>("https://blogs.nasa.gov/stationreport/feed/","NasaISS"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/mission_pages/kepler/news/kepler-newsandfeatures-RSS.rss","NasaKeplerMission"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/chandra_images.rss","NasaChandraMission"));
		subscriptions.add(new Pair<String,String>("http://www1.cbn.com/app_feeds/rss/news/rss.php?section=world","CBN"));
		subscriptions.add(new Pair<String,String>("https://rss.weatherzone.com.au/?u=12994-1285&lt=aploc&lc=12495&obs=1&fc=1&warn=1","WeatherZone"));
		///
		subscriptions.add(new Pair<String,String>("https://www.npr.org/rss/podcast.php?id=510298","NPR"));
		subscriptions.add(new Pair<String,String>("https://business.financialpost.com/feed/","FinancialPost"));
		subscriptions.add(new Pair<String,String>("https://hacked.com/feed","Hacked"));
		subscriptions.add(new Pair<String,String>("https://www.techrepublic.com/rssfeeds/articles/","techrepublic"));
		subscriptions.add(new Pair<String,String>("https://themerkle.com/feed/","TheMerkle"));
		subscriptions.add(new Pair<String,String>("https://www.naic.org/press.xml","naic"));
		subscriptions.add(new Pair<String,String>("https://rss.dailyfx.com/feeds/all","DailyFx"));
		subscriptions.add(new Pair<String,String>("https://www.which.co.uk/news/feed/","Which"));
		subscriptions.add(new Pair<String,String>("https://www.technologyreview.com/stories.rss","TechnologyReview"));
		subscriptions.add(new Pair<String,String>("https://99bitcoins.com/feed/","99Bitcoins"));
		subscriptions.add(new Pair<String,String>("https://www.inverse.com/feed/articles/1.rss","Inverse"));
		subscriptions.add(new Pair<String,String>("https://wccftech.com/feed/","WccFTech"));
		subscriptions.add(new Pair<String,String>("https://boingboing.net/feed","BoingBoing"));
		subscriptions.add(new Pair<String,String>("https://www.prnewswire.com/rss/all-news-releases-from-PR-newswire-news.rss","PRNNewsWire"));
		subscriptions.add(new Pair<String,String>("https://www.naic.org/newswire.xml","naic2"));
		subscriptions.add(new Pair<String,String>("https://www.ccn.com/feed/","CNN"));
		subscriptions.add(new Pair<String,String>("http://rss.nzherald.co.nz/rss/xml/nzhtsrsscid_000000698.xml","NZHerald"));
		subscriptions.add(new Pair<String,String>("https://cointelegraph.com/feed","CoinTelegraph"));
		subscriptions.add(new Pair<String,String>("https://www.vanityfair.com/feed/rss","VanityFair"));
		subscriptions.add(new Pair<String,String>("https://news.bitcoin.com/feed/","BitCoin"));
		subscriptions.add(new Pair<String,String>("https://cms.qz.com/feed/","CMSQZ"));
		subscriptions.add(new Pair<String,String>("https://www.androidauthority.com/feed/","AndroidAuthority"));
		subscriptions.add(new Pair<String,String>("http://fortune.com/feed/","Fortune"));
		subscriptions.add(new Pair<String,String>("https://news.google.com/rss/topics/CAAqJggKIiBDQkFTRWdvSUwyMHZNRGx1YlY4U0FtVnVHZ0pWVXlnQVAB?hl=en-US&gl=US&ceid=US:en","Googlefeed"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/educationnews.rss","Nasa"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/breaking_news.rss","Nasa2"));
		subscriptions.add(new Pair<String,String>("https://blogs.nasa.gov/stationreport/feed/","NasaISS"));
		subscriptions.add(new Pair<String,String>("https://www.nasa.gov/rss/dyn/mission_pages/kepler/news/kepler-newsandfeatures-RSS.rss","NasaKeplerMission"));
		
	}

	public static List<Pair<String,String>> getSubscriptions() {
		return subscriptions;
	}
}
