package cp.project;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DBclass {
	private static MongoClient client = null;
	public MongoClient getInstance() {
		if(client == null) {
			String conString = Constants.connectionString;
			MongoClientURI uri = new MongoClientURI(conString);
			client = new MongoClient(uri);
		}
		return client;
	}
}
