package cp.project;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class DBclass {
	private static MongoClient client = null;
	public MongoClient getInstance() {
		if(client == null) {
			MongoClientURI uri = new MongoClientURI(
				    "mongodb://Adi_Cool123:1234567890@banka-kulkarni-shard-00-00-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-01-ghw3i.mongodb.net:27017,banka-kulkarni-shard-00-02-ghw3i.mongodb.net:27017/test?ssl=true&replicaSet=BANKA-KULKARNI-shard-0&authSource=admin&retryWrites=true");
				client = new MongoClient(uri);
		}
		return client;
	}
}
