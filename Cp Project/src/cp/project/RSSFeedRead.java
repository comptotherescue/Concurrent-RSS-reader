/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp.project;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

import javafx.util.Pair;

public class RSSFeedRead {
    public static void read(Pair<String,String> url, RSSStoreFeed store){
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();
            RSSSaxHandler handler = new RSSSaxHandler(store);
            saxParser.parse(url.getKey(), handler);
            ArrayListRSSStoreFeed ar = (ArrayListRSSStoreFeed) store;
            RSSInsertUnique obj = new RSSInsertUnique();
            obj.insertUnique(ar.getList(),url.getValue());
            
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
