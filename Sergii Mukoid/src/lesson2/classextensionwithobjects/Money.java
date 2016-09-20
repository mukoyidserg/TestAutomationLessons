package lesson2.classextensionwithobjects;

import java.net.URL;

public class Money {
	private int value;
	private String currencyName;
	private String currencyPic;
	
public Money(int value, String currencyName, String currencyPic) {
	this.value = value;
	this.currencyName = currencyName;
	this.currencyPic = currencyPic;
	}

public Money(int value, String currencyName) {
	this.value = value;
	this.currencyName = currencyName;
	}

public int getValue() {return value;}
public String getCurrencyName() {return currencyName;}
public String getCurrencyPic() {return currencyPic;}

/*public Image showPicture(URL link) {
	try {
	    URL url = new URL("https://en.wikipedia.org/wiki/United_States_dollar#/media/File:Onedolar2009series.jpg");
	    Image img = ImageIO.read(url);
	    return img;
	} catch (IOException e) {
	}
}*/
}
//show currency images on the screen (!)
