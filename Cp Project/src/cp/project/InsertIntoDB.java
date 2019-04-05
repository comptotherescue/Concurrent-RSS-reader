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
	DBclass db = null;
	MongoDatabase Db = null;
	MongoCollection<Document> collection = null;
	public InsertIntoDB() {
		db = new DBclass();
		client = db.getInstance();
	    Db = client.getDatabase("RSSFeed");
	    collection = Db.getCollection("ESPN"); 
	}
	public InsertIntoDB(MongoClient client,DBclass db,MongoDatabase Db,MongoCollection<Document> collection) {
		this.db = db;
		this.client = client;
		this.Db = Db; 
		this.collection = collection;
	}
	public void insert(ItemRSSClass RSSobj) {
		
		Gson gson = new Gson();
		String json = gson.toJson(RSSobj);              
		Document doc = new Document("GUID",RSSobj.getGuid()).append("JSON", json);
		collection.insertOne(doc); 
	}
}
