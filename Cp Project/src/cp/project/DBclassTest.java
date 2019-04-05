package cp.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mongodb.MongoClient;

class DBclassTest {

	@Test
	void testGetInstance() {
		DBclass obj = new DBclass();
		MongoClient client = obj.getInstance();
		assertNotNull(client);
	}
}
