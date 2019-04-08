package cp.project;
import org.bson.Document;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

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
