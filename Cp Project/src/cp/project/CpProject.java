/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

import java.util.ArrayList;

import javafx.util.Pair;

public class CpProject {

    public static void main(String[] args) {
    	Constants.init();
    	for(Pair<String,String> s : Constants.getSubscriptions()) {
    		ArrayListRSSStoreFeed feedStore = new ArrayListRSSStoreFeed();
    		RSSFeedRead.read(s, feedStore);
    		ArrayList<ItemRSSClass> list = feedStore.getList();
    		for (ItemRSSClass rssItem : list) {
    			System.out.println("guid: " + rssItem.getGuid());
    			System.out.println("title: " + rssItem.getTitle());
    			System.out.println("description: " + rssItem.getDescription());
    			System.out.println("link: " + rssItem.getLink());
    			System.out.println("");
    		}
    	}
    }
}
