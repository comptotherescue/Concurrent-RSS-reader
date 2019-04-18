package cp.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class RSSSaxHandler extends DefaultHandler{
    RSSStoreFeed store;
	ItemRSSClass currentItem;
	String currentElement;
	StringBuffer currentCharacters;
	
    public RSSSaxHandler(RSSStoreFeed store){
        this.store = store;
    }
	
    public RSSStoreFeed getRSSFeedStore(){
        return store;
    }
    
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		if(qName.equalsIgnoreCase("item")) {
			currentItem = new ItemRSSClass();
		}
		currentElement = qName;
		currentCharacters = new StringBuffer();
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(currentItem != null && currentElement != null) {
			if( currentElement.equalsIgnoreCase("guid") ||
				currentElement.equalsIgnoreCase("title") ||
				currentElement.equalsIgnoreCase("description") ||
				currentElement.equalsIgnoreCase("content:encoded") ||
				currentElement.equalsIgnoreCase("link") ||
				currentElement.equalsIgnoreCase("pubDate")){
					currentCharacters.append(ch, start, length);
			}
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException{
		if(qName.equalsIgnoreCase("item")) {
			store.add(currentItem);
		}
		if(currentElement != null && currentCharacters.length() > 0) {
            if(currentElement.equalsIgnoreCase("guid")) {
                currentItem.setGuid(currentCharacters.toString());
            }
			if(currentElement.equalsIgnoreCase("title")) {
				if(currentCharacters.toString().trim().isEmpty())
				{
					currentItem.setTitle("Click on the link to read full post.");
				}
				else
				currentItem.setTitle(currentCharacters.toString());
			}
			if(currentElement.equalsIgnoreCase("description")) {
				if(currentCharacters.toString().trim().isEmpty()||currentCharacters.toString().trim().startsWith("<")||currentCharacters.toString().trim().equals("null")){
					currentItem.setDescription("Click on the link to read full post.");
				}
				else
				currentItem.setDescription(currentCharacters.toString());
			}
			if(currentElement.equalsIgnoreCase("content:encoded")) {
				currentItem.setContent(currentCharacters.toString());
			}	
			if(currentElement.equalsIgnoreCase("link")) {
				if(currentCharacters.toString().trim().isEmpty()){
					currentItem.setLink("Story not available!");
				}
				else
				currentItem.setLink(currentCharacters.toString());
			}
			if(currentElement.equalsIgnoreCase("pubDate")) {
				if(currentCharacters.toString().trim().isEmpty()){
					DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/MM/dd HH:mm:ss");
					LocalDateTime now = LocalDateTime.now();
					currentItem.setPubDate(now+"");
				}
				currentItem.setPubDate(currentCharacters.toString());
			}
		}
	}

}
