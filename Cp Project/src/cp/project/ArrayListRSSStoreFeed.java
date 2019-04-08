package cp.project;

import java.util.ArrayList;

public class ArrayListRSSStoreFeed implements RSSStoreFeed{
    ArrayList<ItemRSSClass> list = new ArrayList<ItemRSSClass>();
    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void add(ItemRSSClass currentItem) {
        list.add(currentItem);
    }
    
    public ArrayList<ItemRSSClass> getList(){
        return list;
    }
}
