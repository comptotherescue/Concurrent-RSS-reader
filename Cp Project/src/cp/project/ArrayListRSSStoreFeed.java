/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

import java.util.ArrayList;

/**
 *
 * @author akulk
 */
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
