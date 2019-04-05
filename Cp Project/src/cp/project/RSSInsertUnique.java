package cp.project;
import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class RSSInsertUnique {
     MongoClient client = null;
     InsertIntoDB iIDb = null;
	public void insertUnique(ArrayList<ItemRSSClass> list) {
		DBclass db = new DBclass();
		client = db.getInstance();
		MongoDatabase Db = client.getDatabase("RSSFeed");
		MongoCollection<Document> collection = Db.getCollection("ESPN");  
		for(ItemRSSClass itm : list) {
		Document doc = new Document("GUID",itm.getGuid());
		iIDb = new InsertIntoDB(client,db,Db,collection);
	    FindIterable<Document> cursor = collection.find(doc);
	    if(cursor.first() == null) {
	       iIDb.insert(itm);
	    }
		}
	}
}
