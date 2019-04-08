package cp.project;

import java.util.Collection;
import java.util.HashMap;

public class HashMapTSSStoreFeed implements RSSStoreFeed{
    HashMap<String, ItemRSSClass> map = new HashMap<String, ItemRSSClass>();
    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public void add(ItemRSSClass currentItem) {
        map.put(currentItem.getGuid(), currentItem);
    }
    
    public Collection<ItemRSSClass> getItems() {
        return map.values();
    }
}
