package cp.project;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertIntoDB {
	MongoClient client = null;
	public void insert(ItemRSSClass RSSobj) {
		DBclass db = new DBclass();
		client = db.getInstance();
		MongoDatabase Db = client.getDatabase("RSSFeed");
		MongoCollection<TDocument>
		Dbcoll.save((DBObject) RSSobj);
	}
}
