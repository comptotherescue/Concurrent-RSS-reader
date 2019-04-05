package cp.project;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Set;

import org.bson.Document;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.DBCollectionCountOptions;

public class InsertIntoDB {
	MongoClient client = null;
	public void insert(ItemRSSClass RSSobj) {
		DBclass db = new DBclass();
		client = db.getInstance();
		MongoDatabase Db = client.getDatabase("RSSFeed");
		MongoIterable<String> collections = Db.listCollectionNames();
		for(String k : collections) {
			System.out.println(k);
		}
		Gson gson = new Gson();
		String json = gson.toJson(RSSobj);              
		MongoCollection<Document> collection = Db.getCollection("ESPN");  
		
		Document doc = new Document("GUID",RSSobj.getGuid()).append("JSON", json);
		collection.insertOne(doc); 
	}
}
